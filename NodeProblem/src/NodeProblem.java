import java.util.Random;

public class NodeProblem {
	public static Node curr;
	public static Node head = new Node();
	
	public static Node tail = new Node();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head.val = -1;
		Random rnd = new Random();
		int num;
		Node curr;
		Node newNode;
		nodePush(1);
		nodePush(2);
		nodeInsert(14);
		nodeInsert(23);
		nodePush(42);
		displayNode();
		System.out.println("After Pop");
		nodePop();
		displayNode();
		System.out.println("After Shift");
		nodeShift();
		displayNode();
		System.out.println("Index search for 42");
		indexOf(42);
		nodePush(42);
		displayNode();
		indexOf(512);
		System.out.println("Reversing list");
		//
		clearNode();
		nodePush(1);
		nodePush(2);
		nodePush(3);
		nodePush(4);
		nodePush(5);
		nodePush(5);
		nodePush(5);
		nodePush(5);
		
		System.out.println("List");
		displayNode();
		reverseNodeList();
		System.out.println("Reversed List");
		displayNode();
		System.out.println(countLikedListMidle());
	}
	// Add node to the last index of the List;
	public static void nodePush(int nodeVal) {
		curr = head;
		Node newNode = new Node();
		while(curr!=null) {
			if(curr.next == null) {
				newNode.val = nodeVal;
				curr.next = newNode;
				//System.out.println("Node added");
				return;
			} else {
				curr = curr.next;
			}
		
		}
	}
	public static void clearNode() {
		head.next=null;
	}
	// Add node to the first index of the List;
	public static void nodeInsert(int nodeVal) {
		curr = head;
		Node oldRef = head.next;
		Node newNode = new Node();
		head.next = newNode;
		newNode.val=nodeVal;
		newNode.next = oldRef;
		
	}
	// Remove the first index of the list
	public static void nodeShift() {
		curr = head;
		head.next = head.next.next;
	}
	// Remove the last index of the list
	public static void nodePop() {
		curr = head;
		Node prev = head;
		
		int index=0;
		while(curr!=null) {
			//System.out.println("Current node is: "+ index++ );
			if(curr.next == null) {
				prev.next = null;
				return;
			}
			prev= curr;
			curr = curr.next;
		}
	}
	// display node
	public static void displayNode() {
		curr = head;
		int index = 0;
		while(curr!=null) {
			System.out.println(index++ +" " +curr.val);
			curr = curr.next;
		}
	}
	public static int indexOf(int nodeVal) {
		int index = 0;
		curr = head.next;
		while(curr!=null) {
			if (curr.val== nodeVal) {
				System.out.println("index of nodeval is:" + index);
				return index;
			} else {
				curr = curr.next;
				index++;
			}
		}
		
		System.out.println("Value not found in NodeList");
		return -1;
	}
	public static void reverseNodeList() {
		Node prev = null;
		curr =head;
		Node next = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		head = prev;
	}
	public static int countLikedListMidle() {
		curr = head;
		Node fastPointer = head.next;
		int value=0;
		while(fastPointer!=null) {
			curr = curr.next;
			if(fastPointer.next.next == null) {
				value = curr.val;
				System.out.println(value);
				return value;
			}
			fastPointer = fastPointer.next.next;
		}
		return value;
	}
}

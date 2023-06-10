
public class MyLinkedList {
	public Node head;
	public int num;
	
	public  void displayLinkedList() {
		Node curr;
		curr = head;
		int index = 0;
		
		while(curr!=null) {
			System.out.println(index+ " This is my current Node: "+ curr.val);
			index++;
			curr = curr.next;
		}
	}
	public int deleteNode(int num) {
		if(head.next==null || head == null) {
			return -1;
		}
		
		Node prev;
		Node curr;
		prev = head;
		while(prev!=null) {
			curr = prev.next;
			if(curr!=null) {
				if(curr.val ==num) {
					System.out.println(num+ "Found the node wto be deleted");
					prev.next= curr.next;
					curr.next = null;
					break;
				}
			} else {
				return -1;
			}
			prev = prev.next;
	
		}
		return 1;
	}
	public int getNodeNum() {
		Node curr = head;
		num = -1;
		if(curr==null || curr.next==null) {
			num = 0; 
			return 0;
		}
		while(curr!=null) {
			curr = curr.next;
			num++;
		}
		
		return num;
	}
	
	public void reverseList() {
		
		if(head==null || head.next ==null) {
			return;
		}
		
		Node prev = null;
		Node curr= head.next;
		Node next = curr.next;
		
		while(next!=null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
		}
	}
	
}
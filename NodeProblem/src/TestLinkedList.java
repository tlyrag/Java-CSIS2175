import java.util.Random;
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node();
		head.val = -1;
		Random rnd = new Random();
		int num;
		Node curr;
		Node newNode;
		
		curr = head;		
		
		for(int i=0;i<10;i++)
		{
			num = i+1;//rnd.nextInt(1,1000);
			newNode = new Node();
			newNode.val = num;
			newNode.next = null; 
			curr.next = newNode;
			curr=curr.next;			
		}
		
		MyLinkedList MyList = new MyLinkedList();
		
		MyList.head = head;
		MyList.displayLinkedList();
		
		//MyList.deleteNode(3);
		//MyList.displayLinkedList();
		int numNode = MyList.getNodeNum();
		System.out.println("The number of node in my list is:" + numNode);
		
		MyList.reverseList();
		MyList.displayLinkedList();
		
		
//		curr=head;
//		int index = 0;
//		
//		while(curr!=null)
//		{
//			System.out.println(index + " node val is "+curr.val);
//			curr=curr.next;
//			index++;
//		}	
		
	}

}
 class Node
{
		Node next=null;
		int data;
		Node(int data)
		{
			this.data=data;
		}
}
public class LinkedList {
		Node head;
		
		public void push(int data)
		{
			Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
				return;
			}
			else
			{
				new_node.next=head;
				head=new_node;
				return;
			}
		}
		public void append(int data)
		{
			Node new_node=new Node(data);
			Node temp=head;
			if(head==null)
			{
				head=new_node;
				return;
			}
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
			return;
			
		}
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			return;
		}
		public int delete(int key)
		{
			Node prev=head;
			Node nextNode=head;
			if(head==null)
			{
				System.out.println("LL is emplty");
				return -1;
			}
			if(head.data==key)
			{
				int data=head.data;
				head=head.next;
				return data;
			}
			while(nextNode!=null && nextNode.data!=key)
			{
				prev=prev.next;
				nextNode=prev.next;
			}
			int data=nextNode.data;
			prev.next=nextNode.next;
			return data;
		}
		public void deleteAt(int index)
		{
			int i=0;
			Node temp=head;
			Node prev=head;
			if(head==null)
			{
				System.out.println("Linked List is empty");
				return ;
			}
			while(i!=index)
			{
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=temp.next;
			return;
			
		}
		public void insertAt(int index,int data)
		{
			Node new_node=new Node(data);
			Node temp=head;
			if(index==0)
			{
				new_node.next=head;
				head=new_node;
				return;
			}
			int i=0;
			while(i!=index-1)
			{
				temp=temp.next;
				i++;
			}
			new_node.next=temp.next;
			temp.next=new_node;
		}
		public void deleteList()
		{
			head=null;
		}
		public void getLenght()
		{
			Node temp=head;
			int len=0;
			while(temp!=null)
			{
				temp=temp.next;
				len++;
			}
			System.out.println("Length of Linked List is : "+len);
		}
		public static void main(String[] args)
		{
		LinkedList ll = new LinkedList();
		ll.append(20);
		ll.push(10);
		ll.push(0);
		ll.append(30);
		ll.append(40);
		ll.append(50);
		ll.display();
		ll.getLenght();
		
		}

}

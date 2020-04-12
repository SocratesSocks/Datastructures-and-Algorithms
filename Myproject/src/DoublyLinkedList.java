class Dnode
{
	Dnode prev=null;
	Dnode next=null;
	int data;
	Dnode(int d)
	{
		this.data=d;
	}
}
public class DoublyLinkedList {
	Dnode head;
	public void display()
	{
		Dnode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		return;
	}
	public void push(int data)
	{
		Dnode new_node = new Dnode(data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=head;
		head.prev=new_node;
		head=new_node;
		return;
		
	}
	public void append(int data)
	{
		Dnode new_node = new Dnode(data);
		Dnode temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
		new_node.prev=temp;
		return;
		
	}
	public void deleteAt(int index)
	{
		Dnode prev_node=head;
		Dnode next_node=head;
		int i=0;
		if(index==0)
		{
			head=head.next;
			return;
		}
		while(index!=i)
		{
			prev_node=next_node;
			next_node=next_node.next;
			i++;
			
		}
		prev_node.next=next_node.next;
		next_node.prev=prev_node;
		return;
	}
	public static void main(String[] args)
	{
		DoublyLinkedList dLL=new DoublyLinkedList();
		dLL.push(0);
		dLL.push(-10);
		dLL.push(-20);
		dLL.append(10);
		dLL.append(20);
		dLL.push(-30);
		dLL.deleteAt(0);
		dLL.deleteAt(0);
		dLL.display();
	}

}

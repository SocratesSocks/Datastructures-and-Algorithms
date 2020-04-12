
public class Tree {
	static class Node
	{
		int value;
		Node left=null;
		Node right=null;
		Node(int value)
		{
			this.value=value;
			left=null;
			right=null;
		}
	}
	public static Node parrent;
	public static int flag;
	public void insert(Node node,int value)
	{
		if(value<node.value)
		{
			if(node.left!=null)
			{
				insert(node.left,value);
			}
			else
			{
				System.out.println("Inserted : "+value+" To left of : "+node.value);
				node.left=new Node(value);
			}
		}
		else if(value>node.value)
		{
			if(node.right!=null)
			{
				insert(node.right,value);
			}
			else 
			{
				System.out.println("Inserted : "+value+" To right of : "+node.value);
				node.right=new Node(value);
			}
		}
	}
	
	public int containsNode(Node current,int value)
	{
		if(current==null)
		{
			return 0;
		}
		if(current.value==value)
		{
			return 1;
		}
		if(value<current.value)
		{
			return containsNode(current.left,value);
		}
		else if(value>current.value)
		{
			return containsNode(current.right,value);
		}
		return -1;
	}
	public void deleteNode(Node current , int value)
	{
		if(current.value<value)
		{
			flag=0;
			parrent=current;
			deleteNode(current.right,value);
		}
		else if(current.value>value)
		{
			flag=1;
			parrent=current;
			deleteNode(current.left,value);
		}
		else
		{
			if(current.left==null && current.right==null)
			{
				if(flag==0)
				{
					parrent.right=null;
				}
				else
				{
					parrent.left=null;
				}
			}
			else if(current.left==null)
			{
				parrent.left=current.right;
			}
			else if(current.right==null)
			{
				parrent.right=current.left;
			}
			else
			{
				int min=minValue(current);
				current.value=min;
			}
		}
	}
	public int minValue(Node curr)
	{
		Node Parrent=curr;
		Node parrentMax=null;
		curr=curr.left;
		while(curr.right!=null)
		{
			parrentMax=curr;
			curr=curr.right;
		}
		parrentMax.right=null;
		return curr.value;
	}
    void inorderRec(Node root) 
    { 
        if (root != null) 
        { 
            inorderRec(root.left); 
            System.out.print(root.value + " "); 
            inorderRec(root.right); 
        } 
        
    } 
	public static void main(String[] args)
	{
		Tree t = new Tree();
		Node root = new Node(10);
		t.insert(root, -10);
		t.insert(root,0);
		t.insert(root, 10);
		t.insert(root,20);
		t.insert(root,15);
		t.insert(root,12);
		t.insert(root, 17);
		t.insert(root, 30);
		t.deleteNode(root, 20);
		t.inorderRec(root);
	
	}

}

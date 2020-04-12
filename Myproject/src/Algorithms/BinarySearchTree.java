package Algorithms;
class Node 
{
	int value;
	Node left;
	Node right;
	Node()
	{
		this.left=null;
		this.right=null;
	}
}
public class BinarySearchTree {
	public static Node head;
	public Node insert(Node root,int key)
	{
		if(root==null)
		{
			root.value=key;
		}
		else if(key<root.value)
		{
			root.left=insert(root.left,key);
		}
		else 
		{
			root.right=insert(root.right,key);
		}
		return root;
	}

}


public class Stack {
	int maxSize=40;
	char arr[] = new char[maxSize];
	int top=-1;
	public boolean isEmply()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	public char pop()
	{
		if(!isEmply())
		{
			char deletedElement=arr[top];
			top--;
			return deletedElement;
		}
		return '1';
	
	}
	public void push(char item)
	{
		if(top==maxSize-1)
		{
			System.out.println("Stack is Full!");
			return;
		}
		top++;
		arr[top]=item;
		return;
	}
	public void display()
	{
		for(int i=0;i<top+1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
	}
	public char peek()
	{
		return arr[top];
	}
	public int prec(char c)
	{
		if(c=='/' || c=='*')
		{
			return 2;
		}
		else if(c=='+' || c=='-')
		{
			return 1;
		}
		else return -1;
	}
	
	public static void main(String[] args)
	{
		Stack s = new Stack();

	}

}
 

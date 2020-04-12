import java.util.Stack;
public class InfixExpression {
	public static void main(String[] args)
	{
		String input = "ABC*DEF^/G*-H*+";
		Stack<String> s=new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				s.push(c+"");
			}
			else
			{
				String c1=s.peek();
				s.pop();
				String c2=s.peek();
				s.pop();
				String res="("+c1+c+c2+")";
				s.push(res);
				System.out.println(res);
			}
		}
		System.out.println(s.peek());
	}

}

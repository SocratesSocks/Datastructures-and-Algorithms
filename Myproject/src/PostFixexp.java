import java.util.Stack;
public class PostFixexp {
	static int prec(char c)
	{
		if(c=='+' || c=='-') return 1;
		else if (c=='*'|| c=='/') return 2;
		else return -1;
	}
	public static void main(String[] args)
	{
		String input="A+(B*C-(D/E-F)*G)*H";
		String output="";
		Stack<Character> s = new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				output+=c;
			}
			else
			{
				if(c=='(')
				{
					s.push('(');
				}
				else if(c==')')
				{
					while(!s.isEmpty()&&s.peek()!='(')
					{
						output+=s.pop();
					}
					s.pop();
				}
				else
				{
					while(!s.isEmpty()&&prec(c)<=prec(s.peek()))
					{
						output+=s.pop();
					}
					s.push(c);
				}
			}
		}
		while(!s.isEmpty())
		{
			output+=s.pop();
		}
		System.out.println(output);
	}

}

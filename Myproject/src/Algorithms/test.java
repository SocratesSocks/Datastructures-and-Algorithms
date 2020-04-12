package Algorithms;
import java.math.BigInteger;

public class test {
	static void fact(int n)
	{
		String s=Integer.toString(n);
		BigInteger res=new BigInteger(s);
		for(int i=n-1;i>0;i--)
		{
			res=res.multiply(BigInteger.valueOf(i));
		}
		System.out.print(res);
	}
	public static void main(String[] args)
	{
		fact(25);
	}

}

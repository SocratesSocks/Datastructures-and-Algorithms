package Collectins;

interface inf1
{
	public void m1();
}
interface inf2 extends inf1
{
	public void m2();
	
}
class testClass implements inf2
{
	@Override 
	public void m1()
	{
		System.out.println("this is m1() ");
	}	
	@Override
	public void m2()
	{
		System.out.println("this is m2() ");
	}
}
public class test {

	public static void main(String[] args)
	{
		testClass obj=new testClass();
		obj.m2();
	}

}

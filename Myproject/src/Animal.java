
public class Animal {
	String name;
	int age;
	
	public void display()
	{
		System.out.println(name + " "+age);
	}
	public static void main(String[] args)
	{
		Animal a1= new Animal();
		a1.name="ali";
		a1.age=20;
		Animal a2=a1;
		Animal a3=new Animal();
		a3=a1;
		a3.name="john";
		a1.name="k";
		a1.display();
		a2.display();
		a3.display();
	}
}

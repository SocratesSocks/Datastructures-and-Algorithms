package Collectins;
import java.util.*;

public class CollectionArrList {
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list.removeAll(list1);
		list.add(0,20);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println(list.size());
	}

}

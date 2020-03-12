import java.util.*;
class Vec
{
	public static void main(String args[])
	{
		Vector v=new Vector(3);
		System.out.println("Initial Size:"+v.size());
		System.out.println("Capacity:"+v.capacity());
		v.addElement(1);
		v.addElement("Ayush");
		v.addElement(5);
		v.addElement(5.45);
		System.out.println("After adding four element Size:"+v.size());
		System.out.println("After adding four element Capacity:"+v.capacity());
		System.out.println("Elements from vector:");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		v.remove(2);
		System.out.println("After Removing:");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		System.out.println("First element:"+v.firstElement());
		System.out.println("Last element:"+v.lastElement());
	}
}
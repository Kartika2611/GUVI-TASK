package task12;
import java.util.ArrayList;

public class Arraylistofstrings {

	public static void main(String[] args) 
	{
		
		//Creating ArrayList
		ArrayList<String> list=new ArrayList<String>();
		//Adding elements in list
		list.add("Hi");
		list.add("Everyone");
		list.add("How");
		list.add("are");
		list.add("you");
		System.out.println("Arraylist :" +list);
		//Removing all elements from ArrayList
		list.clear();
		System.out.println("Arraylist after clearing():" +list);

	}

}

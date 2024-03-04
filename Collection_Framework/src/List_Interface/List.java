package List_Interface;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
	 
	// List Allow Duplicate value
	// List Allow Any null value
	// List Maintaine intetion order
	
		 ArrayList li = new ArrayList();
		
		li.add( "JAVA");
		li.add( true);
		li.add(  null);
		li.add(  'A');
		li.add( "JAVA");
		li.add(  null);
		li.add(  3.14);
		li.add(  44);
		
	 System.out.println(li);
	 System.out.println(li.remove(2));
		
	 System.out.println(li);
	 System.out.println(li.removeAll(li));
	}

}

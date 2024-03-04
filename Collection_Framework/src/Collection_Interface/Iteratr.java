package Collection_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratr {

	public static void main(String[] args) {
		 
		List li = new ArrayList();
		
		li.add( "JAVA");
		li.add( 'a');
		li.add(33.5);
		li.add( 34);
		li.add( "PYTHON");
		
		System.out.println("By using Enhance for loop----");
		
		for(Object sb:li)
			{
		System.out.println(sb);
			
			}

        System.out.println("By using iterator method---");
       
        Iterator it=  li.iterator();
        while(it.hasNext())
     {
    	 System.out.println(it.next());
    	 it.remove();
     }

	}

}

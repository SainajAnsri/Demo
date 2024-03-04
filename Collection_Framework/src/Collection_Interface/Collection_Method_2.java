package Collection_Interface;

import java.util.ArrayList;
import java.util.List;

public class Collection_Method_2 {

	public static void main(String[] args) {
		 
		List<String> li = new ArrayList<String>();
		
		li.add("JAVA");
		li.add("PYTHON");
		li.add("C#");
		li.add("RUBY");
		li.add("HTML");
		
		System.out.println(li);
		
		List<String> lp = new ArrayList<String>();
		
		lp.add( "MANULA");
		lp.add( "AUTOMATION");
		lp.add( "API");
		lp.add( "DATABASE");
		lp.add( "QA");
     
		System.out.println(lp);
		li.addAll(lp);
		System.out.println(li);
		
		lp.remove(0);
		System.out.println(lp);
		lp.removeAll(li);
		
		for(String sb:li)
		{
			System.out.println(sb);
		}
	}

}

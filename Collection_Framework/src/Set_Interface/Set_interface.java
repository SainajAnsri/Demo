package Set_Interface;

import java.util.HashSet;

public class Set_interface {

	public static void main(String[] args) {
	 
		// set NOT accept duplicate value 
		// set can store only one null value 
		// set NOT maintaine intersion order
		// set faster than list 
		// set store the value according to has code value.
		
          HashSet se = new HashSet();
          
          se.add( "Java");
          se.add( " PYTHON");
          se.add( " RUBY");
          se.add(  'A');
          se.add(  3.14);
          se.add(  null);
          se.add(  null);
          se.add( "Java");
          se.add( "Java");
          se.add(  55);
          
          System.out.println(se);
	}

}

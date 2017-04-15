import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
			
	      CollectionSort_1 tester = new CollectionSort_1();

			
	      tester.sortUsingJava8(names2);
	      System.out.println(names2);
	   }
	   

	   
	   //sort using java 8
	   private void sortUsingJava8(List<String> names){
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	      //Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
	   }

}


public class LambdaSOP_3 {
	
	final static String salutation = "Hello! ";

	public static void main(String[] args) {

			   
					//Will work only if there 
					//is 1 method in interface and with 1 parameter only
			      GreetingService greetService1 = messa1ge -> 
			      System.out.println(salutation + messa1ge);
			      greetService1.sayMessage("Mahesh");
			   }
				
			   interface GreetingService {
			      void sayMessage(String message);
			   }
		// TODO Auto-generated method stub


}

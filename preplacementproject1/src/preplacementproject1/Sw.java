

package preplacementproject1;
import java.util.*;


public class Sw {

	public static void main(String[] args) {
		// scanner object for getting input from user
		Scanner obj = new Scanner(System.in);
		// asking the user for getting car type
		System.out.println("enter the type of car");
		
		//user enter the car type
		String type=obj.nextLine();
		// after entering user car that data stored in type
		
		// This else if book ckecking the user entered type with available types of car
		// anyone matches that perticular object is created with pre defined prices by calling the parameterized constracter;
		if(type.equals("Hathback"))
		{
			// calling the constracter with fixed price of services  
			carsb hobj = new carsb(2000,5000,2000,1000,3000);
			
			/*after object of this perticular class is created,
			 * calleing the enters() method for further communiction with user  
			 */
			
			hobj.enters();
		}
		else if(type.equals("Seden"))
		{
			// calling the constracter with fixed price of services 
			carsb sobj = new carsb(4000,8000,4000,1500,6000);
			
			/*after object of this perticular class is created,
			 * calleing the enters() method for further communiction with user  
			 */
			
			sobj.enters();
		}
		if(type.equals("suv"))
		{
			// calling the constracter with fixed price of services 
			
			carsb suvobj = new carsb(5000,30000,6000,2500,8000);
			
			/*after object of this perticular class is created,
			 * calleing the enters() method for further communiction with user  
			 */
		
			suvobj.enters();
		}

	}

}

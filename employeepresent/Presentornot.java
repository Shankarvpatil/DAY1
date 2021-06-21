package UC1.Emloyeepresentornot;
import java.util.*;
public class Emp_Attendance {
	public static int Presenty() {
	
		Random random = new Random();
		int ans = random.nextInt(2);
	
		return ans;
	}
	public static void main(String args[]) {
		
		int check = Presenty();
		int isPresent = 1, isAbsent = 0;
		
		if( ans == isPresent ) {
			System.out.println("Employee is present");	
		}
		else {	
			System.out.println("Employee is absent");
		}	
	}
}

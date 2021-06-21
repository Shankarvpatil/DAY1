package UC4_Using_SwitchCase;

import java.util.*;

import UC3_PartTime_Emp_Wage.PartTime_Wage;
public class Switch extends PartTime_Wage {
	
	public static int Switchcase() {
		
		Random randome = new Random();
		int ans = random.nextInt(3);
		return ans;
	}

	public static void main(String[] args) {
		
		int ans = Switch();
		
		switchcase (ans) {
		
		case 1:                                                       
			System.out.println("Employee Full day Wager = "+Wage());
			break;
			
		case 2:                                                    
		
			System.out.println("Employee Part time Wager = "+PartTimeWage());
			break;
		default:
			System.out.println("Employee is Absent");             
		}
		
	}

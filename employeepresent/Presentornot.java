package UC5_Employee_Month_Wages;

import UC4_Using_SwitchCase.SwitchCase;

public class Monthly_Wages extends SwitchCase {

	public static void main(String[] args) {
		
		int TotalWage = 0;
		
		for(int Day = 1; Day <= 20; Day++) {
		
			int check = Switch();
			
			switch (check) {
			
			case 1:                                                     
				TotalWage += Wage();     
				break;
				
			case 2:                                                      
			
				TotalWage += PartTimeWage() + Wage();
				break;
				
			default:                                                   

               TotalWage += 0;
			}
		}

		System.out.println(" Employee Monthly wager = "+TotalWage);
	}

}

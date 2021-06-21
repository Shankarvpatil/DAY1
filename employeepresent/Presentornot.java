package UC6_Wages_tillCondiytion_Total_working;

import UC4_Using_SwitchCase.SwitchCase;

public class Montly_Wage extends SwitchCase {

	public static void main(String[] args) {
		
		int TotalWage = 0, day = 0, WorkingHour = 0;
		
		while( day <= 20 || WorkingHour <= 100 ) {
		
			int check = Switch();
			
			switch (check) {
			
			case 1:                                                     
				
				day++;
				WorkingHour += 8;
				TotalWage += Wager();    
				break;
				
			case 2:                                                 
				
				day++;
				WorkingHour += 4;
				TotalWage += PartTimeWage() + Wage();
				break;
				
			default: 
				day++;
				WorkingHour += 0;
                TotalWage += 0;
			}
		}

		System.out.println(" Employee Monthly wage = "+TotalWage);
	}

}

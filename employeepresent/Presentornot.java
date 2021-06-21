package uc3_PartTime_Emp_Wage;

import java.util.Random;

import uc2_Calculate_Daily_Employee_Wage.Daily_Wage;

public class PartTime_Wage extends Daily_Wage {   
	
	public static int Attendance() {
		
		Random random = new Random();
		int check = random.nextInt(3);
		
		return check;
	}
	
    public static int PartTimeWage() {           
    	
    	int Wage = 20, PartTime = 4;
    	int PartTimeWage = Wage * PartTime;
        return PartTimeWage;
	
    	
    }
    
	public static void main(String[] args) {
		
		int isPresent = 1, isParttime = 2, isAbsent=0;
		
		int attendance = Attendance();  
		int dailyWage = dailyWage();                    
		
		if (attendance == isPresent) {
			
			System.out.print("Employee Full day wage = "+dailyWage);
			}
			
		else if(attendance == isParttime) {

			System.out.println("Employee Part time wage = "+PartTimeWage());
			}
		
		else {
			
			System.out.println("Employee Daily Wager = "+isAbsent);
		}
	}

}

package uc2_Calculate_Daily_Employee_Wage;
import uc1_Emloyee_Attendance.Emp_Attendance;

public class Daily_Wage extends Emp_Attendance {
	
	public static int dailyWage() {
		
		int Wages = 20, Fulltime = 8;
		int Daily_wage = Wages * Fulltime;
		return Daily_wage;
	}
	
	public static void main(String[] args) {
		
		int attendance = presenty();
		
		int isPresent = 1, isAbsent = 0; 
		
		if (attendance == isPresent) {
			
		System.out.print("Employee Daily wage is = "+Daily_wage());
		}
		
		else {
			
			System.out.println("Employee Daily Wage = "+isAbsent);
		}
	}
}

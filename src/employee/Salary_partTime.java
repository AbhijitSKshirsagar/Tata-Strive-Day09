package employee;

import java.util.Random;

public class Salary_partTime {

	public static void main(String[] args) {
		int isFullTime = 1;
		int isHalfTime = 2;
        int empRatePerHr = 20;
        int empHr = 0;
        Random random = new Random();
		int randomNum = random.nextInt(3);
		
	if(randomNum == 1) 
	   {
	    System.out.println("is Full Time");
	    empHr = 8;
	   }
	else if(randomNum == 2) 
	   {
	   System.out.println("is Half Time");
	    empHr = 4;
	   }
	   else
		   System.out.println("employee is abscent");
	
	double salary = empHr  * empRatePerHr ;
	System.out.println("employee Per Day:" +salary);
	}
}

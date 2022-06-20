import java.util.Scanner;


public class EmpSalary {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the salary amount");
	    int salary = in.nextInt();
	    System.out.println("Enter the additional loan amount");
	    int loan = in.nextInt();
	    salary = salary - loan;
	    float tax;
	    int amount;
	    
	    if(salary>1000000) {
	    	tax = (float)0.3 * salary;
	    	amount = (int) (salary-tax);
	    }
	    
	    else if(salary>500000) {
	    	tax = (float)0.2 * salary;
	    	amount = (int) (salary-tax);
	    }
	    else {
	    	tax = (float)0.05 * salary;
	    	amount = (int) (salary-tax);
	    }
	    
	    System.out.println(amount);
	}

}
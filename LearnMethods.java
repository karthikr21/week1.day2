package week1.day2;

public class LearnMethods {
	
	
	public void printCarName() {
		
		System.out.println("SWIFT");
		
	}
	
	
	public int getCarRegNumber() {
		int regNum = 5342;
		return regNum;
		
	}
	
   	public String getCarVarient() {
   		return  "Petrol";
   	
   	}
   	
   	public int multiplyTwoNumbers(int a, int b) {
   		return (a*b);
   	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LearnMethods obj = new LearnMethods();
     
     obj.printCarName();
 int  regNum = obj.getCarRegNumber();
 System.out.println(regNum);
	
	String carVarient = obj.getCarVarient();
	System.out.println(carVarient);

	int multiply = obj.multiplyTwoNumbers(10, 6);
	System.out.println(multiply);
	
	
	}
	
	

}

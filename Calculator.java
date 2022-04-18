package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2,int num3) {

		int sum= num1+num2+num3;
		return sum;
	}
	
	public int sub () {
		int num1 = 30;
		int num2 = 20;
		int sub = num1-num2;
		return sub;
		
	}
	
	
	public double mul(double num1, double num2) {
		double mul = num1*num2;
		return mul;
	}
	
	public float div(float num1,float num2) {
		float div = num1/num2;
		return div;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj = new Calculator();
int sum = obj.add(10,20,30);
System.out.println(sum);

System.out.println(obj.sub());

double mul = obj.mul(5.23233, 6.656);

System.out.println(mul);

float div = obj.div(5.4f, 3.8f);
System.out.println(div);
	}

}

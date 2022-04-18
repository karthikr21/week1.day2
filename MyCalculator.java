package week1.day2;

public class MyCalculator {

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

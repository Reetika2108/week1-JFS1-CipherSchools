import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter BasicPay");
			double basicPay = sc.nextInt();
			double hra = 0, da = 0;
			if(basicPay>=5000) {
				hra = 0.1*basicPay;
				da = 0.2*basicPay;
			}
			else {
				hra = 0.2*basicPay;
				da = 0.3*basicPay;
			}
			System.out.println(hra+" " + da);
			System.out.println(basicPay + hra + da);
		}
	}

}

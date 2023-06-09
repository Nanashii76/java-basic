import java.util.Scanner;
import java.util.Locale;


public class objects {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double px = (x1+x2+x3) / 2;
		double areax = Math.sqrt(px*(px-x1)*(px-x2)*(px-x3));
		
		System.out.println("Enter the measures of triangle Y:");
		
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double py = (y1+y2+y3) / 2;
		double areay = Math.sqrt(py*(py-y1)*(py-y2)*(py-y3));
		
		System.out.printf("Triangle X area: %f\n", areax);
		System.out.printf("Triangle Y area: %f\n", areay);
		
		if (areax > areay) System.out.println("Larger area: X");
		else if (areay > areax) System.out.println("Larger area: Y");
		else System.out.println("Larger area: Same");
		
		sc.close();
		

	}

}

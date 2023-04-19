import java.util.Scanner;
import java.util.Locale;


public class estrutura_condicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char confirm;
		double temp;
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			temp = sc.nextDouble();
			temp = (9*temp)/5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", temp);
			System.out.println("Deseja repetir (s/n)? ");
			confirm = sc.next().charAt(0);
		} while ( confirm != 'n');
		
		sc.close();
		
	}

}

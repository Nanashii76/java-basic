import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		int gender = 'F';
		
		double price1 = 2100.0;
		double  price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f\n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender %c\n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);
		
		Scanner sc = new Scanner(System.in);
		
		// Função de entrada de dados (String)
		String x;
		x = sc.next();
		System.out.println(x);
		
		// Função de entrada de dados (int)
		int y;
		y = sc.nextInt();
		System.out.println(y);
		
		// Função de entrada de dados (double)
		double z;
		z = sc.nextDouble();
		System.out.println(z);

		// Função de entrada de dados (char) charAt(0) pega o primeiro caracter da String
		char a;
		a = sc.next().charAt(0); 
		System.out.println(a);
		
		// next line anterior para não sobrar quebra de linha.
		sc.nextLine();
		
		// Ler dados até uma quebra de linha
		String s1;
		s1 = sc.nextLine();
		System.out.println(s1);
		sc.close();
		
		/*
		 * Funções matemáticas em java
		 * Math.sqrt(x);
		 * Math.pow(x,y);
		 * Math.abs(x);
		 */
		
		// Criando funções (após a função  principal)
		System.out.println(max(1,2,3));
		
	}
	
	public static int max(int n1, int n2, int n3) {
		int aux;
		if (n1>= n2 && n1>=n3) aux = n1;
		else if (n2>=n1 && n2>=n3) aux = n2;
		else aux = n3;
		
		return aux;
	}

}

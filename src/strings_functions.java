import java.util.Scanner;
import java.util.Locale;


public class strings_functions {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Funções interesantes para trabalhar com strings
		 * 
		 * Formatar: toLowerCase(),toUpperCase(), trim() -> 
		 * Recortar: substring(inicio), substring(inicio, fim)
		 * Substituir: Replace(char,char), Replace(string,string)
		 * Buscar: IndexOf, LastIndexOf
		 * str.Split("")
		 * 
		 * */
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		System.out.println("Original: " + original);
		
		// passando a string original para letras minusculas
		System.out.println("Minúscula: " + original.toLowerCase());
		
		//passando a string original para letras maiusculas
		System.out.println("Mibúscula: " + original.toUpperCase());
		
		//Trim elimina os espaços nos cantos dastring
		System.out.println("trim: " + original.trim());
		
		//substrings {define um início e um fim para exibir a string}
		System.out.println("Substring: " + original.substring(2));
		System.out.println("Substring2: " + original.substring(2,9));
		
		//replace
		System.out.println("Replace char: " + original.replace('a', 'x'));
		System.out.println("Replace string: " + original.replace("abc", "xyz"));
		
		//Buscas indexOf e lasindexof -> retornam inteiros
		System.out.println("indexof 'ABC': " + original.indexOf("ABC"));
		System.out.println("LasIndexOf 'FG: " + original.lastIndexOf("FG"));
		
		//Usando o split -> retorna vetore(s)
		String s= "potatto apple orange";
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	
		sc.close();

	}

}

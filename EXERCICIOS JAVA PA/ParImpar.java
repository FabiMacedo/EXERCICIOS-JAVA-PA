
import java.util.Scanner;

public class ParImpar{
	
	public static void main(String[] args) {
	
	int numero;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite um número inteiro:");
	numero = ler.nextInt();
	
           if (numero % 2 == 0 ) {
	
	      System.out.println("O número é par!");

	   } else if ( numero % 2 == 1) {

	      System.out.println("O número é impar!"); 
	
           }

	}

}
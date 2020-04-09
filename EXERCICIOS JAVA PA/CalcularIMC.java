 
import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String[] args) {
	  
	   double peso, altura, imc;

	   Scanner leitor = new Scanner(System.in);

	   System.out.println("Calcule seu IMC!");
	   System.out.println("Digite o seu peso:");
	   peso = leitor.nextDouble();
	   
	   System.out.println("Digite sua altura:");
	   altura = leitor.nextDouble();
	   imc = peso / (altura * altura);
	   System.out.println("O cálculo do seu IMC é: " + imc);

	}

}
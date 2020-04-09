
import java.util.Scanner;
public class CalcularValor {

	public static void main (String [] args){

	double valor,calc1, calc2, calc3, calc4,calc5;
 	String result1,result2;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um número qualquer:");
	valor = ler.nextDouble();

	calc1 = (valor * 3)/2 - 10;
	calc2 = ((Math.pow(3,3))+(Math.pow(2,7))*3)-(15/2);
		
		if (calc2>=valor){result1 = " é menor ou igual a que: ";
		} 
		else { result1 = " é maior que : "; }
	
	calc3 = (15 % 2) + valor; 
	calc5 = (valor * 3);
		
		if (calc3<=calc5){ result2=" é menor que : ";} 
		else { result2=" é maior a : ";}

	calc4 = ((Math.pow(valor,2)) - valor/3) * (10 - 3)* valor;

	System.out.println("O resultado de " +valor+ " * 3)/2 - 10 é = " + calc1);
	
	System.out.println(valor+result1+calc2);
	
	System.out.println(calc3+result2+calc5);
	
	System.out.println("O resultado de ("+valor+" ^2 - " +valor+ " /3) * (10 - 3) * " +valor+ " é = " + calc4);

	}

}
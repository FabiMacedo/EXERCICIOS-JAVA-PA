 import java.util.Scanner;

 public class CalcularSalario {

    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

       String nome;
       double salFuncionario, salMinimo1, salMinimo2, salMinimo3, salMinimo4;
	
       System.out.println("Informe o seu nome:");
       nome = leitor.nextLine();

       System.out.println("Informe o seu sálario R$");
       salFuncionario = leitor.nextDouble();

       System.out.println("Informe o sálario mínimo atual R$");
       salMinimo1 = leitor.nextDouble();

       salMinimo2 = (salMinimo1 * 2);
       salMinimo3 = (salMinimo1 * 3);
       salMinimo4 = (salMinimo1 * 4);

       if (salFuncionario < salMinimo1) {
          System.out.println(nome+" você recebe menos de um salário mínimo!");
      
       } else if ((salFuncionario == salMinimo1) && (salFuncionario < salMinimo2)) {
                System.out.println(nome+" você recebe um salário mínimo!");
      
              } else if ((salFuncionario >= salMinimo2) && (salFuncionario < salMinimo3)) {
                       System.out.println(nome+" você recebe 2 salários mínimos");
                    
                     } else if ((salFuncionario >= salMinimo3) && (salFuncionario < salMinimo4)) {
                              System.out.println(nome+" você recebe 3 salários mínimos");
                   
                            } else if (salFuncionario >= salMinimo4) {
                                     System.out.println(nome+" você recebe 4 ou mais salários mínimos");
                                   }

    } 
 }
 import java.util.Scanner;

 public class CalcularSalario {

    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

       String nome;
       double salFuncionario, salMinimo1, salMinimo2, salMinimo3, salMinimo4;
	
       System.out.println("Informe o seu nome:");
       nome = leitor.nextLine();

       System.out.println("Informe o seu s�lario R$");
       salFuncionario = leitor.nextDouble();

       System.out.println("Informe o s�lario m�nimo atual R$");
       salMinimo1 = leitor.nextDouble();

       salMinimo2 = (salMinimo1 * 2);
       salMinimo3 = (salMinimo1 * 3);
       salMinimo4 = (salMinimo1 * 4);

       if (salFuncionario < salMinimo1) {
          System.out.println(nome+" voc� recebe menos de um sal�rio m�nimo!");
      
       } else if ((salFuncionario == salMinimo1) && (salFuncionario < salMinimo2)) {
                System.out.println(nome+" voc� recebe um sal�rio m�nimo!");
      
              } else if ((salFuncionario >= salMinimo2) && (salFuncionario < salMinimo3)) {
                       System.out.println(nome+" voc� recebe 2 sal�rios m�nimos");
                    
                     } else if ((salFuncionario >= salMinimo3) && (salFuncionario < salMinimo4)) {
                              System.out.println(nome+" voc� recebe 3 sal�rios m�nimos");
                   
                            } else if (salFuncionario >= salMinimo4) {
                                     System.out.println(nome+" voc� recebe 4 ou mais sal�rios m�nimos");
                                   }

    } 
 }
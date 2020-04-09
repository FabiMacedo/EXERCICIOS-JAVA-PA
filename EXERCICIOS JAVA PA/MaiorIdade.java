import java.util.Scanner;

 public class MaiorIdade {
   
   public static void main(String[] args) {
   
      	String sexo;
	String nome;
      	int idade;

      Scanner leitor = new Scanner(System.in); 

      System.out.println("Verificar maior idade");
      System.out.println("Informe seu nome:");
      nome = leitor.nextLine();
     
      System.out.println("Informe o sexo: F/M?");
      sexo = leitor.nextLine();

      System.out.println("Informe sua idade:");
      idade = leitor.nextInt();

      System.out.println("Nome: "+nome+" /Idade: "+idade+" /Sexo: "+sexo);
          
         if(idade >= 18) {

             System.out.println(nome+" você é maior de idade.");

         } else if(idade < 18) {

             System.out.println(nome+" você ainda não é maior de idade.");
          
         }

    }

 }
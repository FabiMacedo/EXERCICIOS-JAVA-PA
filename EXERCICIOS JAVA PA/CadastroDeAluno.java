
import java.util.Scanner;

public class CadastroDeAluno {

    public static void main (String [] args){

    String nome, sexo, curso, turma, periodo, regMat, idade;
    
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    nome = ler.nextLine();

    System.out.println("Digite seu RM: ");
    regMat = ler.nextLine();
    
    System.out.println("Digite sua idade: ");
    idade = ler.nextLine();

    System.out.println("Digite seu sexo: ");
    sexo = ler.nextLine();

    System.out.println("Informe o curso: ");
    curso = ler.nextLine();

    System.out.println("Informe sua turma: ");
    turma = ler.nextLine();

    System.out.println("Informe o período: ");
    periodo = ler.nextLine();

    System.out.println("______________Cadastro do Aluno______________");
    System.out.println("Nome: "+ nome);
    System.out.println("RM: " + regMat);
    System.out.println("Idade: " + idade);
    System.out.println("Sexo: " + sexo);
    System.out.println("Curso: " + curso);
    System.out.println("Turma: " + turma);
    System.out.println("Período: " + periodo);

    }







}


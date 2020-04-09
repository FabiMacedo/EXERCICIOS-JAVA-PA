

public class CalcularPorcentagem {

   public static void main (String [] args) {

   double valor = 60;
   double porcent1, porcent2, porcent3, porcent4; 

   /*a)10%; b)33,33%; c)51,55%; d)91,00% */

   porcent1 = (10 * valor)/ 100;
   porcent2 = (33.33 * valor)/ 100;
   porcent3 = (51.55 * valor)/ 100;
   porcent4 = (91.00 * valor)/ 100;

   System.out.println("*** Cálculo de Porcentagem ***");
   System.out.println("O resultado de 10% de "+valor+ " é "+porcent1);
   System.out.println("O resultado de 33.33% de "+valor+ " é "+porcent2);
   System.out.println("O resultado de 51.55% de "+valor+ " é "+porcent3);
   System.out.println("O resultado de 91.00% de "+valor+ " é "+porcent4);
   
   }
}
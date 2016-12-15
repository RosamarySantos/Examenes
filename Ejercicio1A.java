  import java.util.Scanner;
  /**Clase que nos muestra la secuencia de números dado dos de ellos
  * @author MANUEL
  * @version 1.0
  */
  public class Ejercicio1A{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce primer número:");
      int numeroMenor = sc.nextInt();
      System.out.println("Introduce segundo número:");
      int numeroMayor = sc.nextInt();
      sc.close();

      //identificamos al número mas pequeño y al mas grande
      if (numeroMenor > numeroMayor){ // 12 y 6
        int numeroMenorInicial = numeroMenor;  // guardamos el 12
        numeroMenor = numeroMayor; // 6
        numeroMayor = numeroMenorInicial; //12
      }  //al salir tenemos guardado 6 y 12

      if (numeroMenor == numeroMayor)
        System.out.printf("Has introducido el mismo valor para los dos números %d%n",numeroMenor);
      else{
        //imprimimos de forma ascedente
      	int contador = 1;
        for (int i = numeroMenor; i <= numeroMayor; i++){
          System.out.printf("%5d",i);
	        if (contador % 2 == 0) 
	          System.out.println();
          contador++;
	      }
	      System.out.println();
      }
      System.out.printf("El valor medio de %d y de %d es %.2f%n", numeroMenor, numeroMayor, calcularValorMedio(numeroMenor, numeroMayor));
    }
    /**método que dado dos números nos devuelve su valor medio
    * @param valorMenor uno de los números
    * @param valorMayor el otro valor
    * @return valor medio de ambos números
    */
    public static double calcularValorMedio(int valorMenor, int valorMayor){
      return (valorMenor + valorMayor) / 2.0;
    }



  }

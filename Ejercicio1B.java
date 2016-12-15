  import java.util.Scanner;
  /**Clase que nos muestra la secuencia de 10 números dado tres dígitos
  * El primer dígito indica el número donde se inicia la secuencia
  * El segundo dígito indica el incremento en la secuencia
  * El tercer dígito indica el nº columnas a mostrar
  * @author MANUEL
  * @version 1.0
  */
  public class Ejercicio1B{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce primer número:");
      int numeroInicio = sc.nextInt();
      System.out.println("Introduce segundo número:");
      int numeroIncremento = sc.nextInt();
      System.out.println("Introduce tercer número:");
      int numeroColumnas = sc.nextInt();
      sc.close();
      //controlo que el número de columnas no sea negativo o cero
      if (numeroColumnas < 1)
        numeroColumnas = 2;
    /*  for (int i = 1; i <= 10; i++){
        System.out.printf("%5d",numeroInicio);
        numeroInicio += numeroIncremento;
        if (i % numeroColumnas == 0)
          System.out.println();
      }
      System.out.println();*/
      mostrarEnPantalla(numeroInicio, numeroIncremento, numeroColumnas);
    }
    /** Método que muestra en pantalla la secuencia en tabla formateada
    * @param numeroInicio donde inicia la secuencia
    * @param numeroIncremento indica el incremento en la sucesión
    * @param numeroColumnas indica el nº columnas a formatear en el caso que sea negativo o cero el número de columnas pasa a ser 2
    */
    public static void mostrarEnPantalla(int numeroInicio, int numeroIncremento, int numeroColumnas){
      for (int i = 1; i <= 10; i++){
        System.out.printf("%5d",numeroInicio);
        numeroInicio += numeroIncremento;
        if (i % numeroColumnas == 0)
          System.out.println();
        }
        System.out.println();
    }
  }

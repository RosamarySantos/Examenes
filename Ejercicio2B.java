  import java.util.Scanner;
  /**Clase que nos muestra la secuencia de números dado dos de ellos
  * @author MANUEL
  * @version 1.0
  */
  public class Ejercicio2B{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce una palabra:");
      String palabraMinuscula = sc.next().toLowerCase().trim();
      sc.close();
 
      System.out.printf("La palabra %s contiene %d vocales, ¿tiene tilde? %b%n", palabraMinuscula, contarNumeroVocales(palabraMinuscula), existenTildes(palabraMinuscula));
      System.out.printf("Concatenamos la palabra en mayúscula y minúscuala %s%n", devolverMayusculaMinuscula(palabraMinuscula));
    }
    public static int contarNumeroVocales(String palabra){
      int contadorVocales = 0;
      for (int i = 0; i < palabra.length(); i++){
        char caracter = palabra.charAt(i);
        if (caracter == 'a' || caracter == 'á' || caracter == 'e' ||
          caracter == 'é' || caracter == 'i' || caracter == 'í' ||
          caracter == 'o' || caracter == 'ó' || caracter == 'u' ||
          caracter == 'ú')
            contadorVocales++;
      }
      return contadorVocales;
    }
    public static boolean existenTildes(String palabra) {
      
      boolean tilde = false;
      for (int i = 0; i < palabra.length(); i++){
        char caracter = palabra.charAt(i);
        //System.out.println(caracter);
        if (caracter == 'á' || caracter == 'é' || caracter == 'í' ||
            caracter == 'ó' || caracter == 'ú') {
            tilde = true;
            break;
        }
      }
      return tilde;
    }
    public static String devolverMayusculaMinuscula(String palabra){
      return palabra.toUpperCase()+palabra;
    }



  }

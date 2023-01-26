import java.util.Scanner;
class App {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      Scanner leer = new Scanner(System.in);
      int n; //numero 
      int a = 0;//contador para evaluar condición en while
      System.out.println("Ingresa un numero: ");
      n = leer.nextInt();
      while(n < n)
      {
        System.out.println(n + ".");
        n++;
      }//Recuerda que son DOS EJECICIOS, DEL WHILE ASI QUE CUIDADO. COMENTA EL EJERCICIO QUE QUIERAS REALIZAR
      //Otra práctica para identificar elementos pares. 
      int e,p;
      //además c debe de iniciar en 1 para poder que funcione el algoritmo para obtener pares
      int c = 1; //Este es el contador que manejamos para poder evaluar condición en el ciclo while
      System.out.println("Ingresa un número");
      e = leer.nextInt();
      while(c <= e)
      {
        p = 2 * c - 2; //Algoritmo para obtener numeros pares
        System.out.println(p + ".");
        c++;
      }


    }
  }
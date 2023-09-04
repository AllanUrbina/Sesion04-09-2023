import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       // Estructura switch
       // se usa -> en lugar del :
       // para no necesitar poner la sentencia break;

          Scanner lector=new Scanner(System.in);
          System.out.println("color de semadoro:(r/a/v)");
          char color=lector.next().charAt(0);
     
     switch (color){

        case 'r' -> {
           
            System.out.println("El semaforo esta en Rojo");
           
            System.out.println("Detengase");

        }
        case 'a' -> {
        
          System.out.println("El semaforo esta en Amarillo");
          System.out.println("Maneje más despacio");
        }
        
        case 'v' -> {
        System.out.println("el semaforo esta en Verde ");
        System.out.println("Puede Continuar");
        }
          default ->{

          }
       }
       lector.close();
    }
}

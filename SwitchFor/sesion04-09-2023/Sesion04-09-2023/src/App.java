//estructura repetitiva FOR
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner lector=new Scanner(System.in);
       
        System.out.println("Hello, World!");
     //while(expresion logica){

     //}

     // do {
     // primero corre y despues verifica 
    // }while(expresion logica)
    
    //for (inicializacion variable;expresion logica;modificar el valor ){}
    //ejemplo for (int x=1; x<=10;x++ o x--){}
    
//Ciclo ehile 
//1.variable de control
//while(/*2.expresion logica */){
    //3.actualizar valor variable de control
//}
//ciclo do..while
//1.variable de control
//do{
    //2.actualizar variable de control
//}while (/*3.Expresion logica */);

//ciclo for 
//En este caso, Siempre se conoce la cantidad de interaciones o repeticione
//1. variable de control,Exprecion logica,actualizacion
System.out.println("Tabla de multiplicar");
byte tabla =lector.nextByte();

while(tabla>50){
    System.out.println("valor demasiado alto");
    System.out.println("hasta que tabla de multiplñicar desea");
 tabla = lector.nextByte();
 
 for(int j = 1;j<=tabla;j++){//es para usar otra tabla
      for(int i=1;i<=12;i++){
        System.out.println("::::::::::::::::::::::");
        System.out.println(j+"x"+i+"="+j*i);
      }
   
lector.close();
}
}
    }
}
//if(i<0){  
  //  } else{
      //  System.out.println("su multiplicacion no se pudo realizar");
 //  }


        
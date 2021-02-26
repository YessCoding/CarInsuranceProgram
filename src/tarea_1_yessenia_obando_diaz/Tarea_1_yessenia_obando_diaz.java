/*
 * Universidad Estatal a Distancia
 * Programación Intermedia
 * Tarea 1
 * Estudiante: Yesenia Obando Díaz
 */

package tarea_1_yessenia_obando_diaz;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Tarea_1_yessenia_obando_diaz {


    public static void main(String[] args) {
        // TODO code application logic here
           
    DATCARSEG autoUno = new DATCARSEG ();    
    Scanner entrada = new Scanner ( System.in );
    
    boolean continuar= true;
         
         
         do {
             try {
                 System.out.println(" ¿Cuál es el número de identificación de la persona dueña del auto?");
                 int identificacion = Integer.parseInt(entrada.nextLine()); //usamos parseInt para pasar de String a int
                 autoUno.establecerIdCliente(identificacion);
                 System.out.println(" ¿Cuál es el nombre de la persona dueña del auto?");
                 String nombrePersona = entrada.nextLine();
                 
                 if (esNumero(nombrePersona)){  //valida que no se digiten números en el nombre 
                     System.out.println("No digite números, por favor.");
                     System.out.println(" ¿Cuál es el nombre de la persona dueña del auto?");
                     nombrePersona = entrada.nextLine(); 
                 }
                 
                 autoUno.establecerNombreCliente(nombrePersona);
                 System.out.println(" ¿Cuál es el modelo en años del auto? ");  //excepcion  si persona pone letras
                 int modeloCarro = Integer.parseInt(entrada.nextLine());
                 autoUno.establecerModelo(modeloCarro);
                 System.out.println(" ¿Cuál es el número de placa del auto? ");
                 String numeroPlaca = entrada.nextLine();
                 autoUno.establecerPlaca(numeroPlaca);
                 System.out.println(" ¿Cuál es el monto de seguro del auto por mes? "); //excepcion si persona pone letras
                 int seguroCarro = entrada.nextInt();
                 autoUno.establecerMontoAsegurado(seguroCarro);
                 System.out.println(" ¿La persona dueña del auto tiene alguna discapacidad? Sí = 1 / No = 0"); // expcepcion si persona pone numero diferente de 0 y 1
                 int tieneDiscapacidad = entrada.nextInt(); //usamos parseInt para pasar de String a int
                 autoUno.establecerDiscapacidad(tieneDiscapacidad);
                 continuar = false;
             }
             catch (InputMismatchException | NumberFormatException excepcion1)
             {
                 System.err.printf("Excepción: %s\n", excepcion1);
                 System.out.println("Error. Debe introducir los datos que se le solicitan siguiendo las instrucciones");
                 
             }          
              } while (continuar); 
    
    
    autoUno.recargoPorModelo();
    autoUno.PrimaMensual();
    autoUno.Descuento();
    System.out.println(autoUno.toString());
    
    }
    
    
    //Método para validar que no se pongan números en el nombre
    public static boolean esNumero(String nombrePersona){
        try
        {
            Integer.parseInt(nombrePersona);   //pasa los datos a enteros  
        }
        catch (NumberFormatException excepcion)  // si da excepción, no es número
        {
            return false;
        }
        
        return true;
     }
}
    

     


    

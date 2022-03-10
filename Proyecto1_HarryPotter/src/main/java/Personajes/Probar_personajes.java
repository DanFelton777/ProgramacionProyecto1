/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @autores Daniela Ramos Salazar (20280827) && Irving Alexis Nava Flores (20280864)
 */
import java.util.Scanner;

public class Probar_personajes {
    
    public static void main(String[] args) {
            
   //Insertar informacion a través del teclado 
   String nombre;
   String especie;
   String nacionalidad;
   int edad;
  
        Scanner a = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = a.nextLine();
        
        Scanner b = new Scanner(System.in);
        System.out.print("Introduzca su especie: ");
        especie = b.nextLine();
               
        Scanner c = new Scanner(System.in);
        System.out.print("Introduzca su nacionalidad: ");
        nacionalidad = c.nextLine();  
        
        Scanner d = new Scanner (System.in);
        System.out.println("Por favor introduzca su fecha de nacimiento (numero): ");
        edad=d.nextInt();
        
        Personaje personaje1= new Personaje (nombre,especie,nacionalidad,edad);
         
  
  
    
        //Nombre junto xd, especie, nacionalidad, año de nacimiento (da la edad respecto al año )//

   //Personaje personaje1= newPersonaje (Harry Potter,mago,britanico,1997); 
   //Personaje personaje2= newPersonaje (ViktorKrum,mago,bulgara,1997); 
   
    }
}
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
   String nacionalidad;
   int edad;
   String colegio;
   String especie;
   String casa;
  
        Scanner a = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = a.nextLine();
     
        Scanner b = new Scanner(System.in);
        System.out.print("Introduzca su nacionalidad: ");
        nacionalidad = b.nextLine();  
        
        Scanner c = new Scanner (System.in);
        System.out.println("Por favor introduzca su fecha de nacimiento (numero): ");
        edad=c.nextInt();
                
       Scanner d = new Scanner(System.in);
       System.out.print("Introduzca su especie: ");
       especie = d.nextLine(); 
       
       //Si es mago o bruja entonces le pide su colegio
       String mago = "mago";
       String bruja = "bruja";

       if (especie.equalsIgnoreCase(mago) || especie.equalsIgnoreCase(bruja))
       {Scanner e = new Scanner (System.in);
        System.out.println("Por favor introduzca el nombre de su Alma mater");
        colegio=e.nextLine(); 
       
       // En caso de tener un colegio con casas pregunta su casa
       String ilvermory= "Ilvermory";
       String hogwarts= "Howarts";
       
       if (colegio.equalsIgnoreCase(ilvermory) || colegio.equalsIgnoreCase(hogwarts))
       {Scanner f = new Scanner (System.in);
        System.out.println("Por favor introduzca el nombre de su casa");
        casa=f.nextLine();
       
       Personaje personaje1= new Personaje (nombre,especie,nacionalidad,edad,colegio,casa );}
       
       else 
       {Personaje personaje2= new Personaje (nombre,especie,nacionalidad,edad,colegio );}
       }
       
      
         
  
  
    
        //Nombre junto xd, especie, nacionalidad, año de nacimiento (da la edad respecto al año )//

   //Personaje personaje1= newPersonaje (Harry Potter,mago,britanico,1997); 
   //Personaje personaje2= newPersonaje (ViktorKrum,mago,bulgara,1997); 
   
    }
    private String Sring;
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

import java.util.Scanner;

/**
 *
 * @autores Daniela Ramos Salazar (20280827) && Irving Alexis Nava Flores (20280864)
 */

public class Especies_Caracteristicas {
   
  public String elfo_domestico="Elfo domestico"; 
  public String centauro="Centaruo";   
  public String goblin="Goblin"; 
  public String mago="mago";
  public String bruja="bruja";
  public String especie;
  
  
  public void Especies_Caracteristicas()
   {
       if (especie.equalsIgnoreCase(bruja) || especie.equalsIgnoreCase(mago))
       {System.out.println("Los magos y brujas son seres humanos que nacen con la habilidad de hacer magia");}
         
       if (especie.equalsIgnoreCase(elfo_domestico))
       {System.out.println("Un elfo o elfina doméstico/a (también conocido como simplemente elfos) es una criatura mágica que es inmensamente devota y leal a la persona designada como su amo.");}    
     
       if (especie.equalsIgnoreCase(centauro))
       {System.out.println(" .");}
       
       if (especie.equalsIgnoreCase(goblin))
       {System.out.println(" .");}
   }
}
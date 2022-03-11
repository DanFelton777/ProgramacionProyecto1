/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes.Colegios;

/**
 *
 * @autores Daniela Ramos Salazar (20280827) && Irving Alexis Nava Flores (20280864)
 */

public class Colegios {
    
    public String colegio;
    public String casa;
    
    public Colegios (String colegio, String casa)
    {this.colegio=colegio;}
   
    //Nombre del colegio
    public String getColegio()
    {return colegio;}   
              
    public void setColegio(String colegio)        
    {this.colegio = colegio; }
    
     //Casa
    public String getCasa()
    {return casa;}   
              
    public void setCasa(String casa)        
    {this.casa = casa;}
    
}

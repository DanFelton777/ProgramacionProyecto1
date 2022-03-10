/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @autores Daniela Ramos Salazar (20280827) && Irving Alexis Nava Flores (20280864)
 */

public class Personaje{
    
    public String nombre;
    public String especie;
    public String nacionalidad;
    public int edad;
    
    public Personaje (String nombre, String especie, String nacionalidad, int edad)
    {this.nombre=nombre;
    this.edad=edad;}
    
    //Nombre
    public String getNombre()
    {return nombre;}   
              
    public void setNombre(String nombre)        
    {this.nombre = nombre; }
    
    //Especie
    
     public String getEspecie()
    {return especie;}   
              
    public void setEspecie(String especie)        
    {this.especie = especie; }
            
     //Nacionalidad
    
     public String getNacionalidad()
    {return nacionalidad;}   
              
    public void setNacionalidad(String nacionalidad)        
    {this.nombre = nacionalidad; }
    
   //Edad
     public int getEdad()
    {return edad;}   
              
    public void setEdad(int edad)        
    {this.edad = 2022-edad; }
 
    //llamando
    
    public String imprime ()
    { return "Su nombre es " +getNombre()+ ", es  " +getEspecie () + "su nacionalidad es "+ getNacionalidad()+
            ", su edad es " +getEdad();
    }             
   @Override
    public String toString(){
        return "especie: "+getEspecie()+" nombre: "+getNombre() +"nacionalidad"+getNacionalidad()+ "edad:" +getEdad();}
    
}

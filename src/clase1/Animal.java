package clase1;

import java.util.Scanner;

public class Animal {
    //Atributos 
    private String nombre;
    private int edad;
   

    //Visual studio code SOURCE ACTION 


    //Metodo constructor vacio (Por defecto)
    public Animal(){

    }

    //Metodo constructor 
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    } 

    public Animal (String nombre, String tipo){ //Sobrecarga 

    }


    //METODOS ACCESORES
    public int getEdad(){ //Metodo Get (Mostrar)
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){//Metodo set (Escribir)
        this.edad = edad;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    Scanner sc = new Scanner(System.in);
    //Metodos u operaciones
    public void registrarAnimal(String n, int e){
        // Cuerpo metodo
       nombre=n;
       edad=e;
    }

    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es: " +nombre+ " y tiene: " +edad+ " años ");
    }

  



}

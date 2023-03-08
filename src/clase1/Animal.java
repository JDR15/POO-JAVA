package clase1;

import java.util.Scanner;

public class Animal {
    //Atributos 
    private String nombre;
    public int edad;
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

package clase1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Movie up= new Movie("Up", "Infantil", 2009, 96) ;
      Movie lc= new Movie("La casa del demonio", "Terror", 2009, 95);
      //Constructor vacio
      Animal guacamayo = new Animal();

      Animal panda = new Animal("Bambu", 10);

      //Aplicacion metodos get y set
      guacamayo.setNombre("Pancho");
      guacamayo.setEdad(8);

      System.out.println("El nombre del guacamayo es "+guacamayo.getNombre()+" y su edad es "+guacamayo.getEdad());
      
      panda.mostrarAnimal(); 

      up.mostrarMovie();
      lc.mostrarMovie();
      up.mostrarMovie(2005, 94);
      up.mostrarMovie("Rapidos y furiosos", 2017);
      up.mostrarMovie("accion", "Jonh wick ");

     /* System.out.println("Ingrese el nombre del animal");
      String nombre = sc.nextLine();

      System.out.println("Ingrese la edad del animal");
      int edad = sc.nextInt();

      guacamayo.registrarAnimal( nombre, edad); //Invocar o llamar metodo
      guacamayo.mostrarAnimal();*/




      sc.close();
    }
    
    
    
}

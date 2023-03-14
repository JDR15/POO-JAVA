import java.util.Scanner;

import clase1.Animal;
import clase1.Ave;
import clase1.Movie;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Movie avatar = new Movie();
        Animal tigre = new Animal();
        Ave condorito = new Ave();

        condorito.setNombre("Condorito");
        condorito.setEdad(50);
        condorito.setEnvergadura("300cm");
        condorito.mostrarAve();

        //Aplicacion metodos get y set 

        avatar.setName("Avatar");
        avatar.setCategory("Accion");
        avatar.setYear(2009);
        avatar.setDuration(162);

        System.out.println("El nombre ingresado es " +avatar.getName()+" la categoria es "+avatar.getCategory()+  " el año es "+avatar.getYear()+  " y la duracion en minutos es "+avatar.getDuration() );


        sc.close();
    }
}

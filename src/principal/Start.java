package principal;

import java.util.Scanner;

import Health.Person;

public class Start {
    public static void main(String[] args) {
        Person persona = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su tipo de documento");
        String typeDoc = sc.next();
        System.out.println("Ingrese su documento");
        int document = sc.nextInt();
        System.out.println("Ingrese su nombre");
        String name = sc.next();
        System.out.println("Ingrese su apellido");
        String lastName = sc.next();
        System.out.println("Ingrese su peso");
        int weight = sc.nextInt();
        System.out.println("Ingrese su estatura");
        double height = sc.nextDouble();
        System.out.println("Ingrese su edad");
        int age = sc.nextInt();
        System.out.println("Ingrese su genero");
        String gender = sc.next();
        
        persona.requestData(typeDoc,document,name,lastName,weight,height,age,gender);

        persona.showPerson();

        String retorno = persona.calculatemc(weight, height);
        if(retorno.equals("PESO BAJO")){
            System.out.println("Su peso esta muy bajo ");
        }
        else if(retorno.equals("PESO IDEAL")){
            System.out.println("Su peso es ideal ");
        }
        else if (retorno.equals("SOBREPESO")){
            System.out.println("Su peso esta muy alto ");
        }
    
       
        persona.older();

        sc.close();
    }
}

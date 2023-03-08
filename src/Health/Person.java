package Health;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    String typeDoc;
    int document;
    String name;
    String lastName;
    int weight;
    double height;
    int age;
    String gender;
    String retorno;

 public void requestData(String t, int d, String n, String l, int w, double h, int a, String g){
    typeDoc =t; 
    document = d;
    name= n;
    lastName=l;
    weight = w;
    height= h; 
    age=a;
    gender=g;
 }

 public void showPerson(){
    System.out.println("Su tipo de documento es: " +typeDoc); 
    System.out.println("su numero de documento es: " +document);
    System.out.println("su nombre es: "+name);
    System.out.println(" su apellido es: " +lastName);
    System.out.println( " su peso es: " +weight);
    System.out.println( " su estatura es: " +height+ "m");
    System.out.println( " su edad es: " +age);
    System.out.println("su genero es: " +gender);
   
 }

 public String calculatemc( int weight, double height ){
   double imc = weight / (height*height);
    if(imc<20){
        retorno="PESO BAJO";
    }
    else if(imc<=25){
        retorno="PESO IDEAL";
    }
    else if(imc>25){
        retorno="SOBREPESO";
    }
    return retorno ;
 }

 public void older(){
    if(age<18){
        System.out.println("Es menor de edad");
    }
    else{
        System.out.println("Es mayor de edad");
    }
 }
    

}

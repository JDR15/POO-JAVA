package Health;

import java.util.Scanner;

public class Person3 {
    Scanner sc = new Scanner(System.in);
    private String typeDoc;
    private int document;
    private String name;
    private String lastName;
    private int weight;
    private double height;
    private int age;
    private String gender;
    String retorno;


    //CONSTRUCTORES
    public Person3(){

    }

    public Person3(String typeDoc, int document, String name, String lastname, int weight, double height, int age, String gender){
        this.typeDoc = typeDoc;
        this.document = document;
        this.name = name;
        this.lastName = lastname;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this. gender = gender;
    }

    //ACCESORES
    
    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


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

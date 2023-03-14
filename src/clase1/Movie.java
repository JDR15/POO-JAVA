package clase1;

public class Movie {
    private String name;
    private String category;
    private int year;
    private int duration;

    public Movie(){

    }

    public Movie(String name, String category, int year, int duration){
        this.name=name;
        this.category=category;
        this.year=year;
        this.duration=duration;
    }

    //Metodos accesibles
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }



   public void mostrarMovie(){
    System.out.println("El nombre ingresado es " +name+ " la categoria es " +category+ " el año es " +year+ " y la duracion en minutos es " +duration );
   }


//SOBRECARGA METODO
   public void mostrarMovie(String name, int year){
    System.out.println("El nombre ingresado es "+name+ " el año es "+year);
   }

   public void mostrarMovie(String category,String name){
    System.out.println("La categoria es "+category+ " el nombre es "+name);
   }

   public void mostrarMovie(int year, int duration ){
    System.out.println("El año es "+year+" la duracion es "+duration);
   }
}

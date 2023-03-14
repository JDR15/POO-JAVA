package Health;

public class Empleado extends Person3 {
    //Atributos propios
    private String post;
    private int valueTime;
    private int hoursWorked;
    private String department;

    //CONSTRUCTORES
    public Empleado(){

    }

    public Empleado(String typeDoc, int document, String name, String lastname, int weight, double height, int age, String gender,String post, int valueTime, int hoursWorked, String departament){
      super(typeDoc, document, name, lastname, weight, height, age, gender);
      this.post = post;
      this.valueTime = valueTime;
      this.hoursWorked = hoursWorked;
      this.department = departament;
    }


    //Accesores
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getValueTime() {
        return valueTime;
    }

    public void setValueTime(int valueTime) {
        this.valueTime = valueTime;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
}

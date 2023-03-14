package clase1;

public class Ave extends Animal {

    //Atributos propios

    private String envergadura;

    //vacio
    public Ave (){

    }

    public Ave (String nombre, int edad, String envergadura){
        super(nombre, edad);
        this.envergadura = envergadura;
    }

    //ACCESORES
    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }

    public void mostrarAve(){
        System.out.println("El nombre del animal es "+getNombre()+" su edad es "+getEdad()+" y la envergadura del ave es:" +this.envergadura);
    }
    
}

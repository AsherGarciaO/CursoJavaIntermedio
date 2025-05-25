package clases;

public class Alumno extends Persona{
    private String escuela = "";
    
    public Alumno(String nombre, int edad, String escuela){
        super(nombre, edad);
        this.escuela = escuela;
    }
    
    public void estudiar(){
        System.out.println(this.nombre+" esta estudiando.");
    }
    
    @Override public void presentarse(){
        System.out.println("Hola, me llamo "+this.nombre+" y tengo "+this.edad+". Estudio en "+this.escuela+", mucho gusto en conocerte");
    }
}
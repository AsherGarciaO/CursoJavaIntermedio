package clases;

public class Profesor extends Persona{
    private String materia = "";
    
    public Profesor(String nombre, int edad, String materia){
        super(nombre, edad);
        this.materia = materia;
    }
    
    @Override public void presentarse(){
        System.out.println("Hola, me llamo "+this.nombre+" y enseño la materia de "+this.materia+", tengo "+this.edad+" años. Mucho Gusto.");
    }
}
package clases;

public abstract class Persona {
    protected String nombre = "";
    protected int edad = 0;
    
    public Persona(String nombre, int edad){        
        this.nombre = nombre;
        this.edad = edad;
    }
    
    protected void hacerEjercicio(){
        System.out.println(this.nombre+" esta haciendo ejercicio.");
    }
    
    public abstract void presentarse();
}
package main;

import clases.*;

public class Main {
    private static interface Saludar{
        public void saludar(String nombre);
        public void hablar(String tema);
    }
    
    private static class P extends Persona implements Saludar{
        private P(String nombre, int edad){
            super(nombre, edad);
        }

        public void hacerActividad(){
            this.hacerEjercicio();
        }

        @Override public void presentarse(){
            System.out.println("Hola, me llamo "+this.nombre+" y tengo "+this.edad+" años.");
        }

        @Override public void saludar(String nombre){
            System.out.println("Hola "+nombre+" soy yo, "+this.nombre);
        }

        @Override public void hablar(String tema){
            System.out.println(this.nombre+" esta hablando sobre "+tema);
        }
    }
    
    public static void main(String[] args) {
        Alumno carlos = new Alumno("Carlos", 20, "Voca 9");
        carlos.presentarse();
        carlos.estudiar();
        
        Profesor profesor = new Profesor("Victor", 25, "Matematicas");
        profesor.presentarse();
        
        Persona asher = new Persona("Asher", 19){
            @Override public void presentarse(){
                System.out.println("Hola, me llamo "+this.nombre+" y tengo "+this.edad+" años.");
                this.hacerEjercicio();
            }
        };
        asher.presentarse();
        
        P p = new P("Octavio", 27);
        p.hablar("el color azul");
        p.hacerActividad();
        p.presentarse();
        p.saludar("Victor");
    }    
    
    public static int sumar(int a, int b){
        return a+b;
    }

    public static float sumar(int a, float b){
        return a+b;
    }

    public static float sumar(float a, int b){
        return a+b;
    }

    public static float sumar(float a, float b){
        return a+b;
    }
}

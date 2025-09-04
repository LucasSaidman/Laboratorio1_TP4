
package Controladores;

import java.util.HashSet;

/** 
    @author Grupo 6 
    Luis Ezequiel Sosa
    Lucas Saidman
    Gimenez Diego Ruben
    Carlos German Mecias Giacomelli
    Tomas Migliozzi Badani
    Luca Rodrigaño
    Ignacio Rodriguez
**/

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarMateria(Materia m){
        if(m == null){
            return false;
        }
        
        for(Materia e : materias){
            if(e.getIdMateria() == m.getIdMateria()){
                System.out.println("Ya esta inscripto en esta materia");
                return false;
            }
        }
        materias.add(m);
        System.out.println("Inscripto con exito en la materia");
        return true;
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }

    @Override
    public String toString() {
        return "Alumno" +
                "\n------------------------" +
                "\nLegajo: " + legajo +
                "\nApellido: " + apellido +
                "\nNombre: " + nombre +
                "\nMaterias: " + materias +
                "\n------------------------";
    }
}

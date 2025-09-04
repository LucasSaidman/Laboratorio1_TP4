
package Colegio;

import Controladores.Alumno;
import Controladores.Materia;
import Controladores.Materia;
import Controladores.Materia;

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

public class Colegio {
    
    public static void main(String[] args) {
        
        Materia m1 = new Materia(1, "Web 2", 2);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
        int materiasA1 = a1.cantidadMaterias();
        System.out.println("El alumno " + a1.getNombre() + " Esta inscripto en " + materiasA1 + " materias");
        
        int materiasA2 = a2.cantidadMaterias();
        System.out.println("El alumno " + a2.getNombre() + " Esta inscripto en " + materiasA2 + " materias");
        
    }
    
}
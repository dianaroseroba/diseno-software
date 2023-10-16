package Facultad;

//Clase principal para probar el código
public class Facultad {
public static void main(String[] args) {
   Estudiante estudiante = new Estudiante("Diana", "Bastidas", "12345678Z", "Soltera", "Software");
   Profesor profesor = new Profesor("Miguel", "Tovar", "87654321Z", "Casado", 2010, "D-100", "Ingenieria de Software");
   PersonalServicio personal = new PersonalServicio("Ana", "Gomez", "11223344Y", "Soltera", 2005, "S-50", "Biblioteca");

   System.out.println(estudiante);
   System.out.println(profesor);
   System.out.println(personal);

   estudiante.matricularNuevoCurso("Diseño Software");
   profesor.cambiarDepartamento("Lògica matemàtica");
   personal.trasladarSeccion("Decanatura");

   System.out.println("\nDespués de los cambios:");
   System.out.println(estudiante);
   System.out.println(profesor);
   System.out.println(personal);
}
}

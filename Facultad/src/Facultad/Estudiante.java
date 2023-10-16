package Facultad;

//Clase Estudiante
class Estudiante extends Persona {
private String cursoMatriculado;

public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, String cursoMatriculado) {
   super(nombre, apellidos, numeroIdentificacion, estadoCivil);
   this.cursoMatriculado = cursoMatriculado;
}

public void matricularNuevoCurso(String curso) {
   this.cursoMatriculado = curso;
}

@Override
public String toString() {
   return super.toString() + ", Curso matriculado: " + cursoMatriculado;
}
}

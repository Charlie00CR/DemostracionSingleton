package Objetos;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private int cedula;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor con todos los parámetros
    public Persona(String nombre, String apellidos, int edad, int cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cedula = cedula;
    }

    //Métodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", cedula=" + cedula +
                '}';
    }
}

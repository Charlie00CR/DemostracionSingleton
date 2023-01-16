package CodigoFuente;

import Objetos.Persona;
import java.util.ArrayList;

/*
Ejemplo de una clase que no está bajo el modelo singleton
 */
public class Funciones {
    //Declaración de variables de clase
    private ArrayList<Persona> personaArrayList= new ArrayList<>();

    public void agregarPersona(Persona persona){
        personaArrayList.add(persona);
        System.out.println("Número de personas en la lista: " + personaArrayList.size());
        System.out.println(persona.toString());
    }
}

package CodigoFuente;

import Objetos.Persona;
import java.util.ArrayList;

/*
Ejemplo de una clase bajo el modelo Singleton
 */
public class Singleton {

    //Declaración de variables de clase
    static private Singleton singleton = null;
    private ArrayList<Persona> personaArrayList= new ArrayList<>();

    //Se deja el constructor como privado para que solo pueda ser accedido desde la misma clase
    private Singleton(){
    }

    public static Singleton getSingleton(){
        //Uso de operador ternario
        // (condicion) ? true:false;
        return (singleton == null) ? singleton = new Singleton() : singleton;
        //Si la instancia es null (no se ha creado), crea una. Caso contrario retorna la ya creada


        /* misma funcionalidad bajo la estructura if-else
        if (singleton == null){
            singleton = new Singleton();
        }
        else {
            return singleton;
        }
        */
    }

    public void agregarPersona(Persona persona){
        personaArrayList.add(persona);
        System.out.println("Número de personas en la lista: " + personaArrayList.size());
        System.out.println(persona.toString());
    }

}

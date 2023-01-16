package CodigoFuente;

import Objetos.Persona;

/*
Clase controladora, de acá se harán los llamados a las demás clases y métodos
 */
public class Controller {

    /*Se declaran las personas como variables de clase para no tener que estar poniendo los parámetros
    a cada rato */
    Persona persona1 = new Persona("Carlos", "Loaiza", 20, 123456789);
    Persona persona2 = new Persona("Angel", "Zeledon", 19, 312456987);
    Persona persona3 = new Persona("Kaleb", "Lizano", 20, 643738304);

    public void demostrarSingleton(){
        System.out.println("Demostración de Singleton \n");
        //Se instancian dos para demostrar que es la misma (s1 == s2)
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        s1.agregarPersona(persona1);
        s1.agregarPersona(persona2);
        s2.agregarPersona(persona3);
    }

    public void demostrarInstanciadas(){
        System.out.println("Demostración de instancias normales \n");
        //Se instancian dos para demostrar que son diferentes (f1 ≠ f2)
        Funciones f1 = new Funciones();
        Funciones f2 = new Funciones();

        f1.agregarPersona(persona1);
        f1.agregarPersona(persona2);
        f2.agregarPersona(persona3);
    }

}

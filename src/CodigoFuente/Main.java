package CodigoFuente;

/*
Clase main
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.demostrarSingleton();
        System.out.println("");
        controller.demostrarInstanciadas();
    }
}

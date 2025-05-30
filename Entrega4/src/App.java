import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("balon");
        pila.push("gorra");
        pila.push("cordon");

        System.out.println("Pila: " + pila);

        vaciarPila(pila);
    }

    public static void vaciarPila(Stack<String> pila) {
        System.out.println("Vaciando la pila...");

        while (!pila.isEmpty()) {
            String valor = pila.pop();
            System.out.println("Elemento eliminado: " + valor);
        }

        System.out.println("La pila está vacía: " + pila);
    }
}
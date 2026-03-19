import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion, valor;

        do {
            System.out.println("\n--- MENÚ ÁRBOL BINARIO ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido en Inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número: ");
                    valor = sc.nextInt();
                    arbol.raiz = arbol.insertar(arbol.raiz, valor);
                    break;

                case 2:
                    System.out.print("Recorrido Inorden: ");
                    arbol.inorden(arbol.raiz);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Número a buscar: ");
                    valor = sc.nextInt();
                    if (arbol.buscar(arbol.raiz, valor)) {
                        System.out.println("Número encontrado");
                    } else {
                        System.out.println("No existe");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
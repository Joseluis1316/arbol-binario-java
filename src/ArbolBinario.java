public class ArbolBinario {
    Nodo raiz;

    public Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }

        if (valor < raiz.valor) {
            raiz.izquierda = insertar(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = insertar(raiz.derecha, valor);
        }

        return raiz;
    }

    public void inorden(Nodo raiz) {
        if (raiz != null) {
            inorden(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            inorden(raiz.derecha);
        }
    }

    public boolean buscar(Nodo raiz, int valor) {
        if (raiz == null) return false;

        if (raiz.valor == valor) return true;

        if (valor < raiz.valor) {
            return buscar(raiz.izquierda, valor);
        } else {
            return buscar(raiz.derecha, valor);
        }
    }
}
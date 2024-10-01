package Lista;

import java.util.ArrayList;

public class ListaSequencial<T> implements Lista<T> {

    private ArrayList<T> elementos;

    public ListaSequencial() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    public void mostrarElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}


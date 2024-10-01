package Lista;

public class Main {
    public static void main(String[] args) {
        ListaSequencial<String> alunos = new ListaSequencial<String>();

        // Adicionando elementos à lista
        alunos.adicionar("maça");
        alunos.adicionar("Banana");
        alunos.adicionar("açaí");

        alunos.mostrarElementos();
    }
}

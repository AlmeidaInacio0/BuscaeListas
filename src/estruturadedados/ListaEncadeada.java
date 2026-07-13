package estruturadedados;

public class ListaEncadeada {
    public static void main(String[] args) {
        Lista numero = new Lista();

        numero.addInicio(10);
        numero.addInicio(30);
        numero.addInicio(50);

        numero.addMeio(25, 1);

        numero.imprimir();
    }
}

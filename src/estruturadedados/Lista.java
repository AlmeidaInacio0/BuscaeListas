package estruturadedados;

public class Lista {
    private  No cabeca;

    public Lista() {
        this.cabeca = null;
    }

    public void addInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = cabeca;
        cabeca = novo;
    }

    public void addMeio(int valor, int posicao) {
        if (posicao ==0 || cabeca == null) {
            addInicio(valor);
            return;
        }

        No atual = cabeca;
        int contador = 0;

        while (atual.proximo != null && contador < posicao) {
            atual = atual.proximo;
            contador++;
        }

        No novo = new No(valor);
        novo.proximo = atual.proximo;
        atual.proximo = novo;
    }

    public void imprimir() {
        No atual = cabeca;

        while (atual != null){
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

}

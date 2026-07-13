public class AlgoritimoBuscaBinaria {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9, 11, 13};
        int valorProcurar = 5;

       int posicao = buscaBinaria(numeros, valorProcurar);
       if (posicao != -1){
           System.out.println("valor encontrado na posição: " + posicao);
       }else {
           System.out.println("Nenhum elemento encontrado");
       }
    }

    public static int buscaBinaria(int[] array, int valorProcurado) {
        int inicio = 0;
        int fim = array.length - 1;



        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == valorProcurado) {
                return  meio;
            } else if (array[meio] > valorProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
            return -1;

    }

}

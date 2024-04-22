package estruturaDeDados

public class MyList implements Lista {
    private int[] array = new int[20];
    int tamanho = 0;

    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < size; i++) {
            if (array[i] == N) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimo() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int maximo() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return array[i-1];
            }
        }
        return -1;
    }

    @Override
    public int sucessor(int valor) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return array[i+1];
            }
        }
        return -1;
    }

    @Override
    public void insereElemento(int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] == valor;
                return;
            }
        }
        else {System.out.println("O array está cheio");}
    }
    /*
    Nessa insereElemento o pessoal criou uma variável tamanho = 0 no começo da classe, o que eu não entendi bem.
    Se o método tivesse como entrada a quantidade de elementos reais do array eu poderia fazer algo assim.
    Ou pelo menos faria mais sentido pra mim.
     */

     @Override
     public void remove(int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length] = 0; //garante que, caso e array estivesse completamente preenchido, o último elemento seja nulo após todos se moverem para a direita.
            }
        }
     }

     @Override
     public int buscaIndice(int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor){
                return i;
            }
        }
        return -1;
     }

     @Override
     public void insereElementoPosicao(int valor, int buscaIndice) {
        if (tamanho == array.length || buscaIndice < 0 || buscaIndice > tamanho) {
            return;
        }
        for (int i = tamanho; i > buscaIndice; i--) {
            array[i] = [i - 1];
        } 
        array[buscaIndice] = valor;
        tamanho++;
    }

    @Override
    public void insereInicio(int valor) {
        for (int i = tamanho; i > 0; i--) {
            array[i] = array[i - 1];
           }
           array[0] = valor;
           tamanho++;
    }

    @Override
    public void insereFim(int valor) {
        array[tamanho] = valor;
        tamanho++;
    }

    @Override
    public void removeIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return;
        }
        for (int i = indice; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;

    }

    @Override
    public void removeInicio() {
        if (tamanho == 0) {
            return;
        }
        for (int i = 0; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        array[tamanho - 1] = 0;
        tamanho--; 
    }

    @Override
    public void removeFim() {
        if (tamanho == 0) {
            return;
        }
        array[tamanho - 1] = 0;
        tamanho--;
    }
}
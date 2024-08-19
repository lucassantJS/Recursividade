public class MatrizRecursiva {

    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 4;

        int[][] matriz = new int[linhas][colunas];
        criarMatrizRecursiva(matriz, 0, 0, 1);

        exibirMatrizRecursiva(matriz, 0, 0);
    }

    public static void criarMatrizRecursiva(int[][] matriz, int linha, int coluna, int valor) {
        if (linha >= matriz.length) {
            return;
        }

        matriz[linha][coluna] = valor;

        if (coluna == matriz[0].length - 1) {
            criarMatrizRecursiva(matriz, linha + 1, 0, valor + 1);
        } else {
            criarMatrizRecursiva(matriz, linha, coluna + 1, valor + 1);
        }
    }

    public static void exibirMatrizRecursiva(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) {
            return;
        }

        System.out.print(matriz[linha][coluna] + " ");

        if (coluna == matriz[0].length - 1) {
            System.out.println();
            exibirMatrizRecursiva(matriz, linha + 1, 0);
        } else {
            exibirMatrizRecursiva(matriz, linha, coluna + 1);
        }
    }
}

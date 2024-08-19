public class MatrizRecursiva {

    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 4;

        int[][] matriz = criarMatriz(linhas, colunas);

        exibirMatrizRecursiva(matriz, 0, 0);
    }

    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int valor = 1;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor++;
            }
        }

        return matriz;
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

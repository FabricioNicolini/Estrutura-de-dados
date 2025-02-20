import java.util.Random;
public class MackVista {
    public static void main(String[] args) {
        int[][] matriz = new int[10][8];
        Random random = new Random();
        
        // Preenchendo a matriz com números aleatórios entre 0 e 6
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = random.nextInt(7); // Gera um número entre 0 e 6
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz de moradores do prédio:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Realizando levantamentos
        int totalMoradores = 0;
        int maxMoradoresAndar = 0;
        int andarMaxMoradores = 0;
        int apartamentosVazios = 0;

        for (int i = 0; i < 10; i++) {
            int moradoresAndar = 0;
            for (int j = 0; j < 8; j++) {
                totalMoradores += matriz[i][j];
                moradoresAndar += matriz[i][j];
                if (matriz[i][j] == 0) {
                    apartamentosVazios++;
                }
            }
            if (moradoresAndar > maxMoradoresAndar) {
                maxMoradoresAndar = moradoresAndar;
                andarMaxMoradores = i + 1; // i + 1 para alinhar com o número do andar real
            }
        }

        // Exibindo os resultados
        System.out.println("Quantidade de apartamentos vazios: " + apartamentosVazios);
        System.out.println("Andar com maior número de moradores: " + andarMaxMoradores);
        System.out.println("Quantidade total de moradores do prédio: " + totalMoradores);
    }
}

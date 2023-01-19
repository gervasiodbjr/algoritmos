
import java.util.Arrays;
import java.util.Random;

public class Algoritimos {

    public static void main(String[] args) {

        // int[] entrada = cerateIntImputArray(10, 200);
        // int[] saida = insertSort(entrada);

        // int[] entrada = {10,9,8,7,6,5,4,3,2,1};
        int[] entrada = {197, 69, 124, 36, 133, 166, 112, 23, 83, 154};
        // int[] entrada = cerateIntImputArray(10, 200);
        imprimeArray(entrada);

        int[] saida = insertSort(entrada);
        imprimeArray(saida);

    }

    public static int[] insertSort(int[] ent) {
        for (int j = 1; j < ent.length; j++) {
            int chave = ent[j];
            int i = j - 1;
            while (i >= 0 && ent[i] > chave) {
                ent[i + 1] = ent[i];
                i = i - 1;
            }
            ent[i + 1] = chave;
        }
        return ent;
    }



    //------- FUNCOES AUXILIARES --------------------------------------------------------------//

    private static int[] cerateIntImputArray(int n, int limit) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(limit);
        }
        return arr;
    }

    private static void imprimeArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


}

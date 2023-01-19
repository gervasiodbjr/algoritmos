import java.util.Arrays;

public class InsercaoListaOrdenada {
    
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        
        imprimirArray(arr);
        int[] arrs = insert(arr, 7);
        imprimirArray(arrs);
        
    }
    
    public static int[] insert(int[] arr, int val) {
        int[] arrt = new int[arr.length + 1];
        for (int i = 0; i < arrt.length; i++) {
            if (i < arr.length && arr[i] > val) {
                arrt[i] = val;
            } else if (i < arr.length) {
                arrt[i] = arr[i];
            }
        }
        return arrt;
    }
    
    
    public static void imprimirArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
     
}

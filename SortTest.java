import java.util.Arrays;
import java.util.Random;

public class SortTest {
    
    public static void main(String[] args) {
        
        Sort sort = new BubbleSort();
        
        testPersonal(sort);
    
    }
    
    public static void sipleTests(Sort sort) {
        int[] input = {4,7,2,5,4,0};
        System.out.println("");
        printArray(input);
        sort.personalSort(input);
        printArray(input);
        System.out.println("");
    }
        
    
    public static void test(Sort sort) {
        int[] input0 = {4,7,2,5,4,0};
        int[] input1 = {10,9,8,7,6,5,4,3,2,1};
        int[] input2 = {197, 69, 124, 36, 133, 166, 112, 23, 83, 154};
        int[] input3 = createArray(42, 1, 1000);
        
        System.out.println("");
        printArray(input0);
        sort.sort(input0);
        printArray(input0);
        System.out.println("");
        
        printArray(input1);
        sort.sort(input1);
        printArray(input1);
        System.out.println("");
        
        printArray(input2);
        sort.sort(input2);
        printArray(input2);
        System.out.println("");
        
        printArray(input3);
        sort.sort(input3);
        printArray(input3);
        System.out.println("");
        
    }
    
    public static void testPersonal(Sort sort) {
        int[] input0 = {4,7,2,5,4,0};
        int[] input1 = {10,9,8,7,6,5,4,3,2,1};
        int[] input2 = {197, 69, 124, 36, 133, 166, 112, 23, 83, 154};
        int[] input3 = createArray(42, 1, 1000);
        
        System.out.println("");
        printArray(input0);
        sort.personalSort(input0);
        printArray(input0);
        System.out.println("");
        
        printArray(input1);
        sort.personalSort(input1);
        printArray(input1);
        System.out.println("");
        
        printArray(input2);
        sort.personalSort(input2);
        printArray(input2);
        System.out.println("");
        
        printArray(input3);
        sort.personalSort(input3);
        printArray(input3);
        System.out.println("");
        
    }
    
    public static int[] createArray(int size, int min, int max) {
        Random random = new Random();
        int[] arr = new int[size];
        int bound = max - min;
        for (int i = 0; i < size; i++) {
            arr[i] = min + random.nextInt(bound);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    
}

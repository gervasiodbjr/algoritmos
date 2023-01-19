public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void personalSort(int[] array) {
        int n = array.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                int e1 = array[i];
                if (array[i + 1] < e1) {
                    array[i] = array[i + 1];
                    array[i + 1] = e1;
                }
            }
        }
    }
    
}

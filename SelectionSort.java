
public class SelectionSort implements Sort {
    
    @Override
    public void sort(int[] array){
        for (int j = 0; j < array.length - 1; j++) {   // walking in the array from beginning to the n-1 element
            int sind = j;
            for (int i = j + 1; i < array.length; i++) {    // walking in the array from beginning to the n element
                if (array[i] < array[sind]) {               // looking for the smallest
                    sind = i;
                }
            }
            int elemt = array[sind];
            array[sind] = array[j];
            array[j] = elemt;
         }
    }

    @Override
    public void personalSort(int[] array) {
        // TODO Auto-generated method stub
        
    }
    
}

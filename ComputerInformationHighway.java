import java.util.Random;

public class ComputerInformationHighway {

    public static void main(String[] args) {
        int unsorted[] = {9, 2, 15, 1};
	bubbleSort(unsorted);
    }
    
    public static void swap(int[] array, int x, int y) {
        if(x < array.length && y < array.length) {
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
        for(int i : array)
            System.out.printf("%d\t", i);
        System.out.println();
    }
    
    public static void bubbleSort(int[] unsorted) {
        for(int k = 0; k < unsorted.length; k++) 
            for(int j = 0; j < unsorted.length - 1; j++) 
                if(unsorted[j] > unsorted[j+1])
                    swap(unsorted, j, j+1);
    }
}
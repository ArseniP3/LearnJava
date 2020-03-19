import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = {8 ,5,4,5,5,6,7,8,9,10,33,66,54,47};
        for (int i = 0; i<array.length; i++){
            int minIndex = i;
            for (int j = i+1; j<array.length; j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array [i] = array [minIndex];
            array[minIndex] = temp;
        }
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}


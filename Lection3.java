import java.util.Arrays;

public class Lection3 {


    static int[] array = {3, 6, 2, 7, 5, 6, 4, 7};

    static void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort();
        System.out.println(Arrays.toString(array));

    }


}

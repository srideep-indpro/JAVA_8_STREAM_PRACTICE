import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class StreamOnArray {

    public static void main(String[] args) {
        // segregate a binary array with 0s on the left side 1s on the other
        int[] arr = { 1, 1, 0, 0, 0, 0, 1, 1 };
        int left = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;

                ++left;
            }
        }

//        Arrays.stream(arr).forEach(System.out::println);
    }
}

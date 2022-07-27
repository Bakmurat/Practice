package albert;

import java.util.Arrays;

public class LargestNum {

    public static void main(String[] args) {
        int [] arr = {10, 3, 25, 5,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
    }
}

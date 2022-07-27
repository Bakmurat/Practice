package albert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNum {

    public static void main(String[] args) {
        int [] arr = {10, 3, 25, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);

        Integer [] arr2 = {10, 3, 25, 5};
        List<Integer> mylist = Arrays.asList(arr2);
        Collections.sort(mylist);
        System.out.println(mylist.get(mylist.size()-1));

        Integer [] arr3 = {10, 3, 25, 5};
        List<Integer> list = Arrays.asList(arr3);
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println("list.get(list.size()-1) = " + list.get(list.size() - 1));

        int [] arr4 = {10, 3, 25, 5};
        int max=0;
        for (int each: arr4){
            if(max<each){
                max=each;
            }
        }
        System.out.println("Max is: "+max);
    }
}

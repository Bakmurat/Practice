package albert;

public class BinarySearch {
    public static void binarySearch(int arr[], int start, int end, int key){
        int mid=(start+end)/2;
        while (start<=end){
            System.out.println("Looking between ranges "+start+" "+end+" and middle index is "+mid+" and middle number "+arr[mid]);
            if(arr[mid]<key){
                start=mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                System.out.println("The "+key+" has been found at index "+mid);
                break;
            }
            mid=(start+end)/2;
        }
        if(start>end){
            System.out.println("Number is not found");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,9,11,14,17,21,43,55,62,72,77,85,86,87,90,91,94,100};
        binarySearch(arr, 0, arr.length-1, 87);

    }
}

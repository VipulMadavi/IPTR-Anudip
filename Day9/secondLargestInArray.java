
public class secondLargestInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 233, 45, 17, 345, 200 };
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secLargest && arr[j] != largest) {
                secLargest = arr[j];
            }
        }
        System.out.println(secLargest);
    }
}

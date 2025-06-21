public class largestElementinArray {
    public static void main(String[] args) {
        int[] arr = { 12, 343, 23, 121, 45 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

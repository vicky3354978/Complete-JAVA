import java.util.Scanner;

public class BinarySearch {
    static void main() {

        System.out.println("Enter array elements:");
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter finding element:");
        int e = in.nextInt();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == e) {
                System.out.println("Element is found at position " + (mid + 1));
                return;
            }
            else if (e < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}
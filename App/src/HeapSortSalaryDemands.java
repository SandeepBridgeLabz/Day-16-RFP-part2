import java.util.Arrays;

public class HeapSortSalaryDemands {

    public static void heapSort(int[] arr) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr,
                                int n,
                                int root) {

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != root) {

            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {

        int[] salaries = {60000, 45000, 90000, 50000, 75000};

        System.out.println("Before Sorting: " +
                Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("After Sorting: " +
                Arrays.toString(salaries));
    }
}
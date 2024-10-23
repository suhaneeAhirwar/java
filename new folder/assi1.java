
    import java.util.Arrays;

public class assi1 {
    public static void main(String[] args) {
        // Example arrays a and b
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        // Merging arrays a and b into a new sorted array c
        int[] c = mergeSortedArrays(a, b);

        // Display the result
        System.out.println("Merged sorted array: " + Arrays.toString(c));
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Store remaining elements of array a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Store remaining elements of array b
        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }
}


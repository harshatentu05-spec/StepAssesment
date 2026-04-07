public class Problem5 {

    static int comparisons = 0;

    // 🔹 Linear Search (first occurrence)
    static int linearSearchFirst(String[] arr, String target) {
        comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    // 🔹 Linear Search (last occurrence)
    static int linearSearchLast(String[] arr, String target) {
        comparisons = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            comparisons++;
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    // 🔹 Binary Search (any one index)
    static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;
        comparisons = 0;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) return mid;
            else if (arr[mid].compareTo(target) < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 🔹 Count occurrences
    static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(target)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] logs = {"accA", "accB", "accB", "accC"};

        int first = linearSearchFirst(logs, "accB");
        System.out.println("Linear First Index: " + first + " Comparisons: " + comparisons);

        int last = linearSearchLast(logs, "accB");
        System.out.println("Linear Last Index: " + last + " Comparisons: " + comparisons);

        int index = binarySearch(logs, "accB");
        System.out.println("Binary Index: " + index + " Comparisons: " + comparisons);

        int count = countOccurrences(logs, "accB");
        System.out.println("Total Occurrences: " + count);
    }
}
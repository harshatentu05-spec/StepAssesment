public class Problem6 {

    // 🔹 Linear Search
    static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // 🔹 Binary Search (find insertion point + floor/ceil)
    static void findFloorCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            }

            if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
    }

    public static void main(String[] args) {
        int[] risks = {10, 25, 50, 100};

        int target = 30;

        System.out.println("Linear Search Found: " + linearSearch(risks, target));

        findFloorCeil(risks, target);
    }
}
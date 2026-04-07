class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Problem2 {

    // Bubble Sort ASC
    static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort DESC
    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20, 1000),
                new Client("B", 50, 2000),
                new Client("C", 80, 1500)
        };

        bubbleSort(arr);
        System.out.println("Bubble ASC:");
        for (Client c : arr) System.out.print(c + " ");

        insertionSort(arr);
        System.out.println("\nInsertion DESC:");
        for (Client c : arr) System.out.print(c + " ");

        System.out.println("\nTop Risks:");
        for (int i = 0; i < Math.min(3, arr.length); i++) {
            System.out.println(arr[i]);
        }
    }
}
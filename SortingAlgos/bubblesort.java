package SortingAlgos;

public class bubblesort {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 4 };
        boolean swaped;
        for (int i = 0; i < arr.length - 1; i++) {
            swaped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaped = true;
                }

            }
            if (swaped == false) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
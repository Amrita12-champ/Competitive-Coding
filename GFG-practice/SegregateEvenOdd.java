import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class SegregateEvenOdd {
    public void evenOdd(int[] arr) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        Collections.sort(evens);
        Collections.sort(odds);

        int index = 0;
        for (int num : evens) {
            arr[index++] = num;
        }
        for (int num : odds) {
            arr[index++] = num;
        }
    }


    public static void main(String[] args) {
        SegregateEvenOdd sol = new SegregateEvenOdd();

        int[] arr1 = {12, 34, 45, 9, 8, 90, 3};
        sol.evenOdd(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0, 1, 2, 3, 4};
        sol.evenOdd(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
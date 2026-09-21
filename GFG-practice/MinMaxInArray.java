import java.util.ArrayList;

public class MinMaxInArray {

    public ArrayList<Integer> getMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {

        MinMaxInArray obj = new MinMaxInArray();

        int[] arr = {9, 5, 1, 8, 2};

        ArrayList<Integer> result = obj.getMinMax(arr);

        System.out.println("Minimum = " + result.get(0));
        System.out.println("Maximum = " + result.get(1));
    }
}
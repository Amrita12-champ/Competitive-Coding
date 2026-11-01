import java.util.ArrayList;

class SmallerInArray {
    public static ArrayList<Integer> lessThan(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < k) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {54, 43, 2, 1, 5};
        int k1 = 6;
        ArrayList<Integer> res1 = SmallerInArray.lessThan(arr1, k1);
        System.out.println(res1);

        int[] arr2 = {5, 6, 7, 2, 4, 8, 9, 1};
        int k2 = 5;
        ArrayList<Integer> res2 = SmallerInArray.lessThan(arr2, k2);
        System.out.println(res2);
    }
}

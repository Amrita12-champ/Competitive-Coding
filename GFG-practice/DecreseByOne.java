import java.util.Arrays;

class DecreaseByOne {
    public static int[] decrementArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i]--;
        }
        return arr;
    }
}

    public static void main(String[] args) {
        int[] arr1 = {54, 43, 2, 1, 5};
        int[] res1 = DecreaseByOne.decrementArray(arr1, arr1.length);
        System.out.println(Arrays.toString(res1));

        int[] arr2 = {324, 5, 2, 2};
        int[] res2 = DecreaseByOne.decrementArray(arr2, arr2.length);
        System.out.println(Arrays.toString(res2));
    }

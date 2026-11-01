class FindMeanArray{
    public static int findMean(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (int) (sum / arr.length);
    }
}
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 6, 5, 8, 7};
        System.out.println("Mean: " + FindMeanArray.findMean(arr1)); //

        int[] arr2 = {4, 4, 4, 4};
        System.out.println("Mean: " + FindMeanArray.findMean(arr2)); //
    }

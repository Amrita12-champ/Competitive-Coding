import java.util.List;
import java.util.ArrayList;

public class CountOfElements {
    public int countOfElements(int x, List<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num <= x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountOfElements obj = new CountOfElements();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int x = 4;
        System.out.println(obj.countOfElements(x, arr));
    }
}
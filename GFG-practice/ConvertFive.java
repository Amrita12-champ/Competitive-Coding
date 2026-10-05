public class ConvertFive {
    public int convertFive(int n) {
        String str = String.valueOf(n);
        str = str.replace('0', '5');
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        ConvertFive obj = new ConvertFive();
        int n = 1004;
        System.out.println(obj.convertFive(n));
    }
}
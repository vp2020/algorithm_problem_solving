/**
 * Created by Viral on 7/25/2018.
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);
        if (a1.length() > b1.length()) {
            int dif = a1.length() - b1.length();
            for (int i = 0; i < dif; i ++) {
                b1.insert(0, '0');
            }
        }
        if (a1.length() < b1.length()) {
            int dif = b1.length() - a1.length();
            for (int i = 0; i < dif; i ++) {
                a1.insert(0, '0');
            }
        }
        int carry = 0;
        int num;
        String as = a1.toString();
        String bs = b1.toString();
        StringBuilder res = new StringBuilder();
        for (int i = as.length() - 1, j = bs.length() - 1; i >= 0 && j >= 0; i --, j --) {
            int x = Character.getNumericValue(as.charAt(i));
            int y = Character.getNumericValue(bs.charAt(j));
            int sum = x + y + carry;
            num = sum % 2;
            carry = sum / 2;
            res.append(num);
        }
        if (carry != 0) {
            res.append("1");
        }
        return res.reverse().toString();
    }
}

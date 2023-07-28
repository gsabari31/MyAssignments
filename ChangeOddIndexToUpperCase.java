package week1.day2;

public class ChangeOddIndexToUpperCase {

    public static void main(String[] args) {

        String test = "changeme";

        char[] w = test.toCharArray();

        for (int i = 0; i < w.length; i++) {

            if (i % 2 != 0) {

               w[i] = Character.toUpperCase(w[i]);
            }
        }

        String s = new String(w);
        System.out.println(s);
    }
}
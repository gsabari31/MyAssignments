package week1.day2;

public class ReverseEvenWords {

    public static void main(String[] args) {

        String test = "I am a software tester";

        String[] wordsArray = test.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {

            if (i % 2 != 0) {

                char[] charArray = wordsArray[i].toCharArray();

                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }
            } else {

                System.out.print(wordsArray[i]);
            }

            System.out.print(" ");
        }
    }
}
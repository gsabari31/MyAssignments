package week1.day2;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String text = "We learn java basics as part of java sessions in java week1";

        int count;

        String[] wordsArray = text.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            count = 1;

            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i].equals(wordsArray[j])) {
                    count++;

                    if (count > 1) {
                        wordsArray[j] = "";
                    }
                }
            }
        }

        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                System.out.print(word + " ");
            }
        }
    }
}
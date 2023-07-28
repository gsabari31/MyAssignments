package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

        int[] A = { 3, 2, 11, 4, 6, 7 };

        
        int[] B = { 1, 2, 8, 4, 9, 7 };

       
        int length = A.length;

       
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");

                }
            }
        }
    }


	}



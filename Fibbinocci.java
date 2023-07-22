package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		{
			int Num1 =0, Num2 =1, sum = 0, i;
			System.out.print(Num1 + " "+ Num2);
			
			for(i=0;i<9;i++) {
				sum = Num1 + Num2;
				System.out.print(" " + sum);
				Num1 = Num2;
				Num2 = sum;
						
			}


	}

}}

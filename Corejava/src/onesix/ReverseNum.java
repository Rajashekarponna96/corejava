package onesix;

public class ReverseNum {
	public static void rev(int number) {
		if (number < 10) {
			 System.out.println(number);
			// return ;
		} else {

			System.out.print(number % 10);
			rev(number / 10);
		}
	}

	public static void main(String[] args) {
		rev(12345);
		rev(54321);
		rev(957360689);
		// int num = 12345;
//		int rev = 0;
//		while (num != 0) {
//			rev = num % 10;// 54321
//			num = num / 10;
//			System.out.print(rev);
//		}

	}

}

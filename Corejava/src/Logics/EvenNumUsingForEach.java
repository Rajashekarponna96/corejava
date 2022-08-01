package Logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumUsingForEach {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			num.add(i);
		}
		System.out.println(num);
		List<Integer> num2 = new ArrayList<Integer>();

		for (Integer i : num) {
			if (i % 2 == 0) {
				num2.add(i);
			}
		}
		System.out.println(num2);
List<Integer> collect = num.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(collect);




	
	}

}

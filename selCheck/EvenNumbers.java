package selCheck;

import java.util.Scanner;

public class EvenNumbers {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter Limit:- ");

int value = sc.nextInt();

System.out.println("Print Even numbers between 1 and " + value);

for (int i = 1; i <= value; i++) {

// if the number is divisible by 2 then it is even
if (i % 2 == 0) {

System.out.print(i + " ");

sc.close();
}
}
}
}
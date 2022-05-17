import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("첫 번째 값 입력: ");
    int first = in.nextInt();
    System.out.print("두 번째 값 입력: ");
    int second = in.nextInt();

    System.out.println("덧셈: " + (first + second));
    System.out.println("뺄셈: " + (first - second));
    System.out.println("곱셈: " + (first * second));
    System.out.println("나눗셈: " + (first / second));
  }
}
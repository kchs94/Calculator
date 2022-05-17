import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("첫 번째 값 입력: ");
    int first = in.nextInt();

    int result = first;
    while (true) {
      System.out.print("사칙연산 +,-,*,/ 중 하나를 입력하세요: ");
      String op = in.next();

      if (op.equals("quit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

      System.out.print("두 번째 값 입력: ");
      int second = in.nextInt();

      if (op.equals("+")){
        result = result + second;
        System.out.println("덧셈: " + result);
      } else if(op.equals("-")){
        result = first - second;
        System.out.println("뺄셈: " + (first - second));
      } else if(op.equals("*")) {
        result = first * second;
        System.out.println("곱셈: " + (first * second));
      } else if(op.equals("/")) {
        result = first / second;
        System.out.println("나눗셈: " + (first / second));
      } else
        System.out.println("사칙연산 기호가 아닙니다.");
    }
  }
}
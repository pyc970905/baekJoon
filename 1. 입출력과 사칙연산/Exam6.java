import java.util.*;

public class Exam6 {

    //6. 사칙연산 (모든 연산 문제)
    public static void main(String []args){

        //(0 < A, B < 10)
        Scanner input = new Scanner(System.in);

        Integer a,b;

        a = input.nextInt();
        b = input.nextInt();

        if(a > 0 && b < 10 ) {
            System.out.println("두 수의 덧셈은 " + (a + b));
            System.out.println("두 수의 뺄셈은 " + (a - b));
            System.out.println("두 수의 곱셈은 " + (a * b));
            System.out.println("두 수의 나눗셈 몫은 " + (a / b));
            System.out.println("두 수의 나눗셈 나머지는 " + (a % b));
        }
        else if (a <= 0){
            System.out.println("숫자 a의 범위가 맞지 않습니다.");
        }

        else if ( b >= 10 ) {
            System.out.println("숫자 b의 범위가 맞지 않습니다.");
        }

    }

}

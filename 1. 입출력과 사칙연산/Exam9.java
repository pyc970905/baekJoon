import java.util.*;

public class Exam {

        // 8. 킹, 퀸, 룩, 비숍, 나이트, 폰
        public static void main(String []args){

          Scanner input = new Scanner(System.in);

          String[] numbers = input.nextLine().split(" "); // 입력값 : 준비되어있는 체스말 숫자

          Integer[] afterNumbers = {1,1,2,2,2,8}; //필요한 체스말 숫자

          Integer result[] = new Integer[6]; // 필요로하는 체스말 숫자

          for (int i = 0; i <numbers.length; i++) {
                  result[i] = afterNumbers[i] - Integer.parseInt(numbers[i]);
                  System.out.print(result[i] + " ");
          }

          input.close();

        }

}

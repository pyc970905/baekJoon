import java.util.*;

public class Exam7 {
    
        // 7. ??! (중복된 아이디를 입력했다는 가정하에 해당 아이디 뒤에 특정 문자값을 더해 출력하는 문제)
        public static void main(String []args){

            Scanner input = new Scanner(System.in);

            String id = input.nextLine();

            if (id.length() < 50 && !id.isEmpty() && id != null) {
                System.out.println(id +"??!");
            }
            else {
                System.out.println("유효하지 않은 입력값입니다.");
            }

        }

}

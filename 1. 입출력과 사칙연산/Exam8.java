import java.util.*;

public class Exam8 {

        // 8.1998년생인 내가 태국에서는 2541년생?!
        public static void main(String []args){
                //(1000 ≤ y ≤ 3000)
                Scanner input = new Scanner(System.in);

                Integer thaiYear = input.nextInt();

                Integer imortalYear = 543;

                if (thaiYear != null && thaiYear >= 1000 && thaiYear <= 3000) {
                  
                        System.out.println(thaiYear - imortalYear);
                  
                }
        }

}

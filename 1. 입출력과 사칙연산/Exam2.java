public class Practice {

//2. A+B (두 수를 입력받고 합을 출력하는 문제)

    public static void main(String []args){

        //(0 < A, B < 10)
        Scanner input = new Scanner(System.in);

        Integer a,b;

        a = input.nextInt();
        b = input.nextInt();

        if(a > 0 && b < 10 ) {
            System.out.println(a + b);
        }
        else if (a <= 0){
            System.out.println("숫자 a의 범위가 맞지 않습니다.");
        }

        else if ( b >= 10 ) {
            System.out.println("숫자 b의 범위가 맞지 않습니다.");
        }

    }

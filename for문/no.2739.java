/*  Backjoon 2739번 문제
 *   문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
 *   입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 *   출력 : 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */
import java.util.Scanner; //Scanner 클래스 호출
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in); // Class 객체 생성
        int num = sr.nextInt(); //num에 입력받은 정수값을 할당

        for (int i = 1; i < 10; i++) {
            int result = num*i; //변수 result에 num*i의 결과값을 할당
            int logic = result; //정수형 변수 logic에 result 할당(구구단의 계산 결과를 출력시킬 변수로 사용)
            System.out.println( num + " * " + i + " = " + logic); //num + i = logic 출력문
        }//end for 
    }//end main
}//and class

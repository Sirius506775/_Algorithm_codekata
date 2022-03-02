/*  Backjoon 1330번 문제
 *   문제 : 두 수 비교하기
 *   입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 *   출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
            - A가 B보다 큰 경우에는 '>'를 출력한다.
            - A가 B보다 작은 경우에는 '<'를 출력한다.
            - A와 B가 같은 경우에는 '=='를 출력한다.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int num1 = sr.nextInt();
        int num2 = sr.nextInt();

        if(num1 < num2){
            System.out.println("<");
        }else if(num1 > num2){
            System.out.println(">");
        }else{
            System.out.println("==");
        }
    }
}

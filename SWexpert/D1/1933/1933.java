import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            if((n % i) == 0)
                System.out.print(i + " ");
        }
	}
}
/*
입력으로 1개의 정수 N 이 주어진다.

정수 N 의 약수를 오름차순으로 출력하는 프로그램을 작성하라.
 

[제약사항]

N은 1이상 1,000이하의 정수이다. (1 ≤ N ≤ 1,000)
 

[입력]

입력으로 정수 N 이 주어진다.


[출력]

정수 N 의 모든 약수를 오름차순으로 출력한다.
*/

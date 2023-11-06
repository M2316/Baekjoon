package loopQuestion;

import java.util.Scanner;

public class Question10951 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        EoF (End of File)
        입력에서 더 이상 읽을 수 있는 데이터가 없을 때 우리는 EoF즉, 파일의 끝이라 한다.
        읽을 수 있는 데이터가 없다는 뜻은 입력을 하지 않았다는 뜻과 같으므로 null을 뜻한다.
         */
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(0<a && b < 10){
                System.out.println(a+b);
            }else{
                continue;
            }
        }

    }
}

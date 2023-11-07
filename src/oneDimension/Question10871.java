package oneDimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question10871 {

    public static void main(String[] args) throws IOException {




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i< N;i++){
            int value = Integer.parseInt(st.nextToken());

            if(value < X){
                sb.append(value).append(" ");
            }

        }
        System.out.println(sb);

    }

    public static void OtherAnswer1(){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int input = in.nextInt();
            if(input < X){
                sb.append(input + " ");
            }

        }
        System.out.println(sb);

    }


    /*
     BufferedReader+StringTokenizer를 이용한 방법이 가장 빠르다 (N의 값이 커질수록 유리 함)
     StringTokenizer는 문자열을 받아서 배열로 만들어 준다
     split이랑 매우 유사해 보이지만 StringTokenizer를 사용하면 객체로 반환되는 것이 아닌
     생성한 StringTokenizer객체를 통해 분절되고 분절된 것을 token이라고 한다  nextToken()을 하면 token순서대로 불러온다
      StringTokenizer를 사용하는 예는 "10 5"입력했다면 10을 처음에 반환하고 이후 nextToken()을 다시 호출하면 5가 반환 된다.
     */
    public static void OtherAnswer2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i< N;i++){
            int value = Integer.parseInt(st.nextToken());

            if(value < X){
                sb.append(value).append(" ");
            }

        }
        System.out.println(sb);



    }
}

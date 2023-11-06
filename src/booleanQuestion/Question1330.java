package booleanQuestion;

import java.util.Scanner;

public class Question1330 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[] input = sc.nextLine().split(" ");

        if(input.length != 2){
            System.out.println("2개의 숫자만 입력하세요.");
            return;
        }

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else if(a == b){
            System.out.println("==");
        }else{
            System.out.println("잘못된 입력.");
        }

    }
}

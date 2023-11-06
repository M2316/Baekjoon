package booleanQuestion;

import java.util.Scanner;

public class Question2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int minit = Integer.parseInt(input[1]);

        if(hour > 24 || minit > 60){
            System.out.println("다시 입력 하세요.");
            return;
        }

        minit -= 45;

        if(minit < 0){
            minit = 60 - Math.abs(minit);
            hour -= 1;
        }
        if(hour < 0){
            hour = 24 + hour;
        }
        System.out.println(hour+ " " + minit);
    }
}

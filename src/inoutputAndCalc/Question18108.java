package inoutputAndCalc;

import java.util.Scanner;


/**
 * 불기로 받은 날짜를 서기 연도로 변환하는 로직
 * 불기 - 543년 = 서기 연도
 *
 * 서기 => 예수 탄생일 기준
 * 불기 => 석가 탄생일 기준 (서기 + 544)
 *
 */
public class Question18108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int inputYear = Integer.parseInt(input);

        if (inputYear >= 1000 && inputYear <= 3000) {
            inputYear -= 543;
            System.out.println(inputYear);
        }

    }
}

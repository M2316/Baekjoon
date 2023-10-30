package inoutputAndCalc;

import java.util.Scanner;

public class Question132005 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] val = input.split(" ");

        long value = 0;

        for(int i=0; i<val.length; i++){
            value += Long.parseLong(val[i]);
            System.out.println(value);
        }


        System.out.println(value);

    }
}

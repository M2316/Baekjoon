package loopQuestion;

import java.util.Scanner;

public class Question25314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int n = Integer.parseInt(input)/4;
        String output = "";

        for(int i=0;i<n; i++){
            if(i != 0)output += " ";
            output += "long";
        }
        output += " int";

        System.out.println(output);


    }
}

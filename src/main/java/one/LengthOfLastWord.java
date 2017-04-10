package one;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */
public class LengthOfLastWord {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            String line = cin.nextLine();

            String[] result = line.split(" ");
            System.out.println(result[result.length - 1].length());
        }
    }
}

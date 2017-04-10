package one;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */
public class TheNumberOfChar {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            String line = cin.nextLine();
            line = line.toUpperCase();
            char c = cin.nextLine().toUpperCase().charAt(0);
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (c == line.charAt(i))    count++;
            }
            System.out.println(count);
        }
    }
}

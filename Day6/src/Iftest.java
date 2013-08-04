import java.util.Scanner;

///**
// * Created by Administrator on 13-8-4.
// */
//import java.io.*;

public class Iftest {
    public static void main(String[] args)
//    throws IOException
 {
     Scanner scanner = new Scanner(System.in);
        int i = 1;
        int grade ;

        while (i == 1){

        System.out.println("请输入成绩：");
            grade = scanner.nextInt();

//        grade = System.in.read();
        if (grade >= 60)
        {
            if (grade <=80) System.out.println("passed");
            else {
                if (grade <=100) System.out.println("good");
                else System.out.println("error");
                }
        }
        else System.out.println("Not passed!");
        System.out.println("继续，请输入1.否则按任意非1键结束。");
        i = scanner.nextInt();
        }
    }
}

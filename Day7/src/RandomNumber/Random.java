package RandomNumber;

/**
 * Created by Administrator on 13-8-10.
 */
public class Random extends java.util.Random{
     public static void main(String[] args) {
//        int a;
        for (int i = 0; i < 10000; i++) {
            Random a = new Random();
            System.out.print((int)(a.nextDouble()*20+1)+" ");
        }
         System.out.print("...............................................");
         for (int i = 0; i < 10000; i++) {
             double r = Math.random()*20+1;
                     System.out.print((int)r+" ");
//             System.out.print("...............................................");

        }
    }

}

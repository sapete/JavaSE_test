//import com.sun.org.apache.xerces.internal.impl.msg.XMLMessageFormatter_ko;
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

//import javax.swing.plaf.synth.SynthGraphicsUtils;
import java.util.Scanner;

///**
// * Created by Administrator on 13-8-4.
// */
public class Prime_Facorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int k = 1;//重复判定
        i = scanner.nextInt();
        System.out.print(i + "=");
        while (k == 1) {
        while (true){
                        if (i == 1) {
                            System.out.println("1 is a prime number！");
                            break;
                        }
                        for (j = 2; j < i+1; j++) {
                            if (i%j == 0)
                            {
                                i = i/j;
                                if (i == 1) {
                                    System.out.print(j);
                                    break;
                                }
                                else {
                                    System.out.print(j+"*");
                                    break;
                                }

                            }
                    }
            System.out.println("重新判定请输入1，退出请输入其他");
            k = scanner.nextInt();
        }
        }
    }
}

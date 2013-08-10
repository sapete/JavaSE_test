/**
 * Created by Administrator on 13-8-10.
 */
public class J_Teacher extends J_Employee{
    public int m_classHour;

    public J_Teacher() {
        m_classHour = 96;
    }
    public void mb_printInfo(){
        System.out.println("working time is"+m_workYear);
        System.out.println("teaching time is"+m_classHour);
    }
    public static void main(String args[]){
        J_Employee a = new J_Employee();
        a.mb_printInfo();
        a = new J_Teacher();
        a.mb_printInfo();
    }
}

import com.sun.xml.internal.ws.handler.ClientSOAPHandlerTube;

/**
 * Created by Administrator on 13-8-10.
 */
public class J_Employee {
    public int m_workYear;

    public J_Employee(){
        m_workYear = 1;
    }
    public void mb_printInfo(){
        System.out.println("working time is"+m_workYear);
    }
}

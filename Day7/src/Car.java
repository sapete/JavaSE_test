/**
 * Created by Administrator on 13-8-10.
 */
public class Car extends Vehicle {
    int company;

    public Car (String motive_Power,int size,double max_Speed,String motion_Range,double carrying_Capacity,int company){
        super ( motive_Power, size, max_Speed, motion_Range, carrying_Capacity);
        this.company = company;
    }

    void inputOil (){

    }

}

import java.lang.invoke.VolatileCallSite;

/**
 * Created by Administrator on 13-8-10.
 */
public class Vehicle {

    String motive_Power;
    int size;
    double max_Speed;
    String motion_Range;
    double carrying_Capacity;


    public Vehicle(String motive_Power, int size, double max_Speed, String motion_Range, double carrying_Capacity) {
        this.motive_Power = motive_Power;
        this.size = size;
        this.max_Speed = max_Speed;
        this.motion_Range = motion_Range;
        this.carrying_Capacity = carrying_Capacity;
    }

    void usage(){

    }
    void speed(){

    }

    public static void main(String[] args) {
//        Vehicle airplane = new Vehicle("oil",2,200.3,"on the road",2000);
//        airplane.max_Speed = 1000;
//        airplane.carrying_Capacity = 20000;
//        airplane.motion_Range = "In the Sky";
//        airplane.motive_Power = "aviation diesel oil";
//        Vehicle car = new Vehicle("1",2,2,"2",2);
//        car.max_Speed =350;
//        car.motion_Range = "On the road";
//        car.carrying_Capacity = 1000;
//        car.motive_Power = "oil or electricity";
//        System.out.print(airplane.max_Speed);
//        System.out.print(airplane.carrying_Capacity);
//        System.out.print(airplane.motive_Power);
//        System.out.print(airplane.motion_Range);
//        System.out.println(airplane.size);
//        System.out.print(car.motion_Range);
//        System.out.println(car.carrying_Capacity);
    }
}

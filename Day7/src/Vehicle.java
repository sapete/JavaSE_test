import java.lang.invoke.VolatileCallSite;

/**
 * Created by Administrator on 13-8-10.
 */
public class Vehicle {

    String moive_Power;
    int size;
    double max_Speed;
    String motion_Range;
    double carrying_Capacity;

    void usage(){

    }
    void speed(){

    }

    public static void main(String[] args) {
        Vehicle airplane = new Vehicle();
        airplane.max_Speed =1000;
        airplane.carrying_Capacity = 20000;
        airplane.motion_Range = "In the Sky";
        airplane.moive_Power = "aviation diesel oil";
        Vehicle car = new Vehicle();
        car.max_Speed =350;
        car.motion_Range = "On the road";
        car.carrying_Capacity = 1000;
        car.moive_Power = "oil or electricity";
        System.out.println(airplane.max_Speed);
        System.out.println(airplane.carrying_Capacity);
        System.out.println(airplane.moive_Power);
        System.out.println(airplane.motion_Range);
        System.out.println(airplane.size);
        System.out.println(car.motion_Range);
        System.out.println(car.carrying_Capacity);
    }
}

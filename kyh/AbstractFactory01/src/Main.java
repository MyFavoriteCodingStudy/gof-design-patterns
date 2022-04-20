import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtFactory;
import samchully.SamchullyFactory;

public class Main {
    public static void main(String[] args) {
        BikeFactory samchullyFactory = new SamchullyFactory();
        Body samchullyBody = samchullyFactory.createBody();
        Wheel samchullyWheel = samchullyFactory.createWheel();

        System.out.println(samchullyBody.getClass());
        System.out.println(samchullyWheel.getClass());

        BikeFactory gtFactory = new GtFactory();
        Body gtBody = gtFactory.createBody();
        Wheel gtWheel = gtFactory.createWheel();

        System.out.println(gtBody.getClass());
        System.out.println(gtWheel.getClass());
    }
}

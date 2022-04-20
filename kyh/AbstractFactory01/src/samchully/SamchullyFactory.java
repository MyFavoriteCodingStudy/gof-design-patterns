package samchully;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class SamchullyFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamchullyBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamchullyWheel();
    }
}

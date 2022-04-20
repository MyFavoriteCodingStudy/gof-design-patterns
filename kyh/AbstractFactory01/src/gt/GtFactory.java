package gt;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class GtFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}

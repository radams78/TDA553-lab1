package labb1;

public class Flatbed extends Trailer {
    private final int MAX_NUMBER_OF_CARS;
    private Loadable loadable;

    public Flatbed(int maxLoad, int MAX_NUMBER_OF_CARS, double x, double y) {
        super(maxLoad);
        this.MAX_NUMBER_OF_CARS = MAX_NUMBER_OF_CARS;
        this.loadable = new Loadable(MAX_NUMBER_OF_CARS, x, y);
    }

    // Specific method for raising the platsform of the truck
    // Puts the platform down so cars can get onto the flatbed
    @Override
    public void extendPlatform() {
        super.setPlatformExtended();

    }

    // Specific method for lowering platsform
    // Puts the platform up so the truck can drive
    @Override
    public void retractPlatform() {
        if (super.getPlatformExtended()) {
            super.setPlatformRetracted();
        } else {
            throw new IllegalArgumentException("Platform is already up");
        }
    }

    public void load(Car car) {
        loadable.load(car);
    }

    //TODO: unload(car)?
    public Movable unload() {
        return loadable.unload(null);
    }
}

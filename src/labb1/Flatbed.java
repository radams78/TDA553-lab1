package labb1;

public class Flatbed extends Trailer {
    private final int MAX_NUMBER_OF_CARS;
    private int loadedCars;
    private int winchCableLength;
    private Loadable loadable;

    public Flatbed(int maxLoad, int MAX_NUMBER_OF_CARS, double x, double y) {
        super(maxLoad);
        this.MAX_NUMBER_OF_CARS = MAX_NUMBER_OF_CARS;
        this.loadedCars = 0;
        this.winchCableLength = 5;
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

    public void load(Movable car) {
        loadable.load(car);
    }

    public Movable unload() {
        return loadable.unload(null);
    }

    // When platform is extended and there is a car on the flatbed it can be
    // unloaded
    public void unLoadCar(int proximityToTransporter) {
        if (super.getPlatformExtended().equals(true)) {
            if (this.loadedCars > 0) {
                this.loadedCars -= 1;
            } else {
                throw new IllegalArgumentException("Car transporter is already empty");
            }
        } else {
            throw new IllegalArgumentException("Platform is not down");
        }
    }
}

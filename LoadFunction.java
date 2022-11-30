

public interface LoadFunction {
    
    void load(double x, double y, Object o);

    void unload(double x, double y);

    int getCapacity();

}

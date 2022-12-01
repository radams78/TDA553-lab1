package Lab1.vehicles;

public interface ILoadable {
    public void load(ICanLoad load);

    public void unload(ICanLoad load);

    public double getPosX();

    public double getPosY();
}

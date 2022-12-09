package Lab1.vehicles;

public interface ILoadable {
    public void loadOnto(ICanLoad load);

    public void unloadFrom(ICanLoad load);

    public double getPosX();

    public double getPosY();
}

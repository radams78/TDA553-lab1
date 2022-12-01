package Lab1.vehicles;

import java.util.Set;

public interface ICanLoad {
    public Set<ILoadable> loadedObjects = null;

    public double getPosX();

    public double getPosY();

    public void load(ILoadable loadObject);

    public void unload(ILoadable loadObject);
}

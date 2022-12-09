package Model;
import java.util.ArrayDeque;

public interface CarLoadable {
    
    void load(Car c);

    void unload();

    ArrayDeque<Car> getCars();
}

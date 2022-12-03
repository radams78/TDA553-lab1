package labb1;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.*;
public class LoadableTest {
    @Test
    public void loadable_unloads_things_near_it(){
        double loadableX = 0;
        double loadableY= 0;
        Loadable loadable = new Loadable(1, loadableX, loadableY);
        Saab95 saab = new Saab95(null, 1, 1, 0, 0);
        loadable.load(saab);
        loadable.unload(saab);
        assert(Helpers.inBounds(1, -1, saab.getX()-loadableX)== 0
         && Helpers.inBounds(1, -1, saab.getY()-loadableY)==0);
    }
    @Test
    public void loadable_only_unloads_stored_items(){
        Loadable loadable = new Loadable(1, 0,0);
        Saab95 saab = new Saab95(null, 1, 1, 0, 0);
        loadable.load(saab);
        assertThrows(IllegalStateException.class, () -> {loadable.unload(new Saab95(null, 0, 0, 0, 0));});
    }
}

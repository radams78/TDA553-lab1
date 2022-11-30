import java.util.ArrayList;

public class LoadObjects implements LoadFunction{

    private int capacity;
    ArrayList<String> objects;

    public LoadObjects(int capacity){

        this.capacity = capacity;
    }

    @Override
    public void load(double x, double y, Object o) {

        if (objects.size() + 1 > capacity){
            System.out.println("The load is full");
        }
        
        else{
            String c = (String) o;
            objects.add(c);
        }
    }

    @Override
    public void unload(double x, double y) {
        objects.remove(-1);
        
    }

    @Override
    public int getCapacity() {

        return capacity;
    }
    
}

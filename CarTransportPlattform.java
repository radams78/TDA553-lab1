

public class CarTransportPlattform implements Plattform{

    private Boolean ableToLoad;
    private int plattformState;
    private LoadFunktion load;
    
    public CarTransportPlattform(){
        load = new LoadFunktion(10);
        this.plattformState = 0;
        this.ableToLoad = true;
    }

    @Override
    public void plattformUp(int state) {

        this.setPlattformState(1);
        this.ableToLoad = false;
    }

    @Override
    public void plattfromDown(int state) {

        this.setPlattformState(0);
        this.ableToLoad = true;
        
    }

    public Boolean getAbleToLoad() {
        return ableToLoad;
    }

    @Override
    public void setPlattformState(int plattformState) {
        if (plattformState > 1 || plattformState < 0){
            System.out.println("Only accepts values between 1 or 0");;
        }
        else {
            this.plattformState = plattformState;
        }
        
    }

    @Override
    public int getPlattformState() {
        return plattformState;
    }

}
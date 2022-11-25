public class AngledPlattform implements Plattform{

    private int plattformState;
    private int plattformAngle;

    public AngledPlattform(int plattformAngle){

        this.plattformAngle = plattformAngle;
    }

    @Override
    public void plattformUp(int state){
       
        this.setPlattformState(Math.min(this.getPlattformState() + state, plattformAngle));

    }

    @Override
    public void plattfromDown(int state) {
       
        this.setPlattformState(Math.max(this.getPlattformState() - state, 0));
        
    }

    @Override
    public void setPlattformState(int plattformState) {
        
        this.plattformState = plattformState;
        
    }

    @Override
    public int getPlattformState() {
        return plattformState;
    }
    

}

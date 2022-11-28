
public class AngledPlattform implements Plattform{

    private int maxPlattformAngle;
    private int plattformState;

    public AngledPlattform(int maxPlattformAngle){

        this.maxPlattformAngle = maxPlattformAngle;
    }

    @Override
    public void plattformUp(int state){
       
        this.setPlattformState(Math.min(this.getPlattformState() + state, maxPlattformAngle));

    }

    @Override
    public void plattfromDown(int state) {
       
        this.setPlattformState(Math.max(this.getPlattformState() - state, 0));
        
    }

    @Override
    public void setPlattformState(int plattformState) {
        if ((plattformState > maxPlattformAngle) || (plattformState < maxPlattformAngle)){
            System.out.println("Only accepts value between 0 and " + maxPlattformAngle);
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

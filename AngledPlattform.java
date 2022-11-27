public class AngledPlattform extends Plattform{

    private int maxPlattformAngle;

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
    void setPlattformState(int plattformState) {
        if ((plattformState > maxPlattformAngle) || (plattformState < maxPlattformAngle)){
            System.out.println("Only accepts value between 0 and " + maxPlattformAngle);
        }
        
        else {
            this.plattformState = plattformState;
        }
    }    

}

package Model;

public class AngledPlatform implements PlatformType{

    private int maxPlatformAngle;
    private int platformState;

    public AngledPlatform(int maxPlatformAngle){

        this.maxPlatformAngle = maxPlatformAngle;
    }

    @Override
    public void platformUp(int state){
       
        this.setPlatformState(Math.min(this.getPlatformState() + state, maxPlatformAngle));

    }

    @Override
    public void platfromDown(int state) {
       
        this.setPlatformState(Math.max(this.getPlatformState() - state, 0));
        
    }

    @Override
    public void setPlatformState(int platformState) {
        if ((platformState > maxPlatformAngle) || (platformState < 0)){
            System.out.println("Only accepts value between 0 and " + maxPlatformAngle);
        }
        
        else {
            this.platformState = platformState;
        }
    }

    @Override
    public int getPlatformState() {
        return platformState;
    }

}

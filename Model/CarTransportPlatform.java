package Model;

public class CarTransportPlatform implements PlatformType{

    private int platformState;
    
    public CarTransportPlatform(){
        this.platformState = 0;
     
    }

    @Override
    public void platformUp(int state) {

        this.setPlatformState(1);
    }

    @Override
    public void platfromDown(int state) {

        this.setPlatformState(0);
    }

    @Override
    public void setPlatformState(int platformState) {
        if (platformState > 1 || platformState < 0){
            System.out.println("Only accepts values between 1 or 0");;
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
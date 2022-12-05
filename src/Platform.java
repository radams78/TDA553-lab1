public class Platform{ //can create a class instead because you want to have the functions in scania
    int maxAngle = 70;
    int minAngle = 0;
    double platformAngle = 0;
     public double PlatformAngleinterval(double platformAngle ) { // faställer vinkeln för platformen att den max får vara 70 och min vara 0
            platformAngle = Math.max(Math.min(platformAngle, maxAngle), minAngle);
            return platformAngle;
        }
    public double getPlatformAngle() {
        return platformAngle;
    }
    public void setPlatformAngle(double platformAngle) {
        this.platformAngle = platformAngle;
    }
    public double openPlatform(double platformAngle){
        platformAngle += 1;
        PlatformAngleinterval(platformAngle); //  if > 70 , angle = 70
        return platformAngle;
    }
    public double closePlatform(double platformAngle){
        platformAngle -= 1;
        PlatformAngleinterval(platformAngle);
        return platformAngle;
    }
    }
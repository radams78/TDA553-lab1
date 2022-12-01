
public class Platform{ //can creat a class instead because you want to have the functions in scania
int maxAngle = 70;
int minAngle = 0;
double platformAngle = 0;


 private void PlatformAngleinterval(double platformAngle ) { // faställer vinkeln för platformen att den max får vara 70 och min vara 0
        platformAngle = Math.max(Math.min(platformAngle, maxAngle), minAngle);      //TODO test
    }


public double getPlatformAngle() {
    // TODO Auto-generated method stub
    return platformAngle;
    
}

public void setPlatformAngle(double platformAngle) {
    // TODO Auto-generated method stub
    this.platformAngle = platformAngle; 
    
}


public double openPlatform(double platformAngle){       //TODO test
    platformAngle += 1;
    PlatformAngleinterval(platformAngle);
   return platformAngle;
}

public double closePlatform(double platformAngle){  //TODO test
    platformAngle -= 1;
    PlatformAngleinterval(platformAngle);
    return platformAngle;
}
}


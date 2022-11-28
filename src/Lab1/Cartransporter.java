package Lab1;

public class Cartransporter implements Trailer {
    private Boolean extendedRamp;

    public Cartransporter(Boolean extendedRamp) {
        this.extendedRamp = extendedRamp;
    }

    public Boolean getExtendedRamp() {
        return extendedRamp;
    }

    public void extendRamp() {
        this.extendedRamp = true;
    }

    public void retractRamp() {
        this.extendedRamp = false;
    }

    public Boolean allowDriving() {
        return !extendedRamp;
    }
}

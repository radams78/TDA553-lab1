

public class TrimBody extends Body{
    private double trimFactor;
    public TrimBody(double trim){
        this.trimFactor = trim;
    }
    public double getTrimFactor(){
        return this.trimFactor;
    }
}

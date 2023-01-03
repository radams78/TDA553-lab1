package Model;
public interface PlatformType {

    void platformUp(int state);

    void platfromDown(int state);

    void setPlatformState(int plattformState);

    int getPlatformState();
}

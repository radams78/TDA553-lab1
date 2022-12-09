package Model;
public interface Platform {

    void platformUp(int state);

    void platfromDown(int state);

    void setPlatformState(int plattformState);

    int getPlatformState();
}

package cn.edu.cuit.car.serverlet.moudle;

/**
 * Created by jianglei on 16/5/9.
 */
public class Position {
    private long longitude;
    private long latitude;

    public Position(long longitude, long latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
}
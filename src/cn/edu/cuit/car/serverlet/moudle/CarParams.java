package cn.edu.cuit.car.serverlet.moudle;

/**
 * Created by jianglei on 16/5/9.
 */
public class CarParams {
    private int speed;
    private Position position;
    private Status status;

    public CarParams(int speed, Position position, Status status) {
        this.speed = speed;
        this.position = position;
        this.status = status;
    }

    public CarParams() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

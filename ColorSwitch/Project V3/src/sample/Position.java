package sample;

import java.io.Serializable;

public class Position implements Serializable {
    private  double x;
    private double y;
    public Position(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
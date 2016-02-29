package Model.Entities;

/**
 * Created by drmiller on 29.02.2016.
 */
public class Coordinate extends Entity {
    private int cX;
    private int cY;

    public int getcX() {
        return cX;
    }

    public int getcY() {
        return cY;
    }

    public void setcX(int cX) {
        this.cX = cX;
    }

    public void setcY(int cY) {
        this.cY = cY;
    }
}

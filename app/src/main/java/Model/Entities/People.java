package Model.Entities;

/**
 * Created by drmiller on 29.02.2016.
 */
public class People extends Entity {

    public People() {}

    public People(int id, String name, Coordinate coordinate)
    {
        setID(id);
        setCoordinate(coordinate);
        setName(name);
    }



    private int ID;
    private String name;
    private Coordinate coordinate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate(){
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate)
    {
        this.coordinate = coordinate;
    }
}

package Model.Entities;

/**
 * Created by drmiller on 29.02.2016.
 */
public class People extends Entity {

    public People() {}

    public People(int id, String name, Coordinate coordinate)
    {
        setId(id);
        setCoordinate(coordinate);
        setName(name);
    }

    private String name;
    private Coordinate coordinate;

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

    @Override
    public String toString() {
        return name;
    }
}

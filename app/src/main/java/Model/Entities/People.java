package Model.Entities;

/**
 * Created by drmiller on 29.02.2016.
 */
public class People extends Entity {

    public People() {}

    public People(String name)
    {
        setName(name);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

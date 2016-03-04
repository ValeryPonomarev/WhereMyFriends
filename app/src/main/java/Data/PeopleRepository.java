package Data;

import java.util.ArrayList;
import java.util.List;

import Model.Entities.Coordinate;
import Model.Entities.Entity;
import Model.Entities.People;

/**
 * Created by drmiller on 04.03.2016.
 */
public class PeopleRepository implements IRepository {
    @Override
    public List<People> getItems() {
        List<People> peoples = new ArrayList<People>();
        for (Integer i = 1; i < 10; i++)
        {
            peoples.add(new People(i, "Name " + i.toString(), new Coordinate(i*5,i*5)));
        }

        return peoples;
    }

    @Override
    public People getItem(Integer id) {
        return new People(id, "Name " + id.toString(), new Coordinate(id*5, id*5));
    }
}

package Data;

import java.util.List;

import Model.Entities.Entity;

/**
 * Created by drmiller on 29.02.2016.
 */
public interface IRepository {
    public List<? extends Entity> getItems();
    public Entity getItem(Integer id);
}

package Model.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.List;

import Data.IRepository;
import Data.PeopleRepository;
import Data.RepositoryFactory;
import Model.Entities.People;

/**
 * Created by lord on 02.03.2016.
 */
public class PeopleArrayAdapter extends ArrayAdapter<People> {

    int resource;

    public PeopleArrayAdapter(Context context, int resource)
    {
        super(context, resource);
        PeopleRepository repository = (PeopleRepository)RepositoryFactory.GetRepository();
        List<People> peoples = repository.getItems();
        super.addAll(peoples);
    }

    public PeopleArrayAdapter(Context context, int resource, List<People> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout newView;
        People people = getItem(position);

        if(convertView == null)
        {
            newView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(inflater);
            layoutInflater.inflate(resource, newView, true);
        }
        else
        {
            newView = (LinearLayout)convertView;
        }
        return newView;
    }
}

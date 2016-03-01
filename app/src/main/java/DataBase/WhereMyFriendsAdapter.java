package DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by drmiller on 29.02.2016.
 */
class WhereMyFriendsDBHelper extends SQLiteOpenHelper {

    public WhereMyFriendsDBHelper(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int version){
        super(context, name, cursorFactory, version);
    };

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //super.onUpgrade(db,oldVersion, newVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //super.onCreate(db);
    }
}

package greenDao;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by guquanding on 2017/5/26.
 */

public class GreenDaoHelper {

    private static DaoMaster.DevOpenHelper mHelper;
    private static SQLiteDatabase db;
    private static DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;

    public static void initDataBase(Context context){
        mHelper = new DaoMaster.DevOpenHelper(context,"stock-db",null);
        db = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public static greenDao.DaoSession getmDaoSession() {
        return mDaoSession;
    }

    public static SQLiteDatabase getDb() {
        return db;
    }
}

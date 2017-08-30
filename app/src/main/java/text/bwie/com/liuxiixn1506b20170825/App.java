package text.bwie.com.liuxiixn1506b20170825;

import android.app.Application;

import org.xutils.DbManager;
import org.xutils.x;

/**
 * 类描述：app类
 * 姓名 ：刘希鑫
 */

public class App extends Application {

DbManager dbManager;
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
        DbManager.DaoConfig daoConfig=new DbManager.DaoConfig()
                .setDbName("yuekao")
                .setDbVersion(1)
                .setAllowTransaction(true);
        dbManager=x.getDb(daoConfig);
    }

    public DbManager getDbManager() {
        return dbManager;
    }
}

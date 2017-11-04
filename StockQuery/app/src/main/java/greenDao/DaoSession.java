package greenDao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import greenDao.StockSave;

import greenDao.StockSaveDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig stockSaveDaoConfig;

    private final StockSaveDao stockSaveDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        stockSaveDaoConfig = daoConfigMap.get(StockSaveDao.class).clone();
        stockSaveDaoConfig.initIdentityScope(type);

        stockSaveDao = new StockSaveDao(stockSaveDaoConfig, this);

        registerDao(StockSave.class, stockSaveDao);
    }
    
    public void clear() {
        stockSaveDaoConfig.clearIdentityScope();
    }

    public StockSaveDao getStockSaveDao() {
        return stockSaveDao;
    }

}
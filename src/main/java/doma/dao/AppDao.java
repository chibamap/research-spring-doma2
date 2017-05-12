package doma.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Script;

import doma.AppConfig;

@Dao(config = AppConfig.class)
public interface AppDao {

    @Script
    void create();

    @Script
    void drop();

}

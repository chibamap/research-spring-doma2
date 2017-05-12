package doma.dao;

import java.util.List;

import doma.AppConfig;
import doma.entity.Person;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

//import doma.AppConfig;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao(config = AppConfig.class)
public interface PersonDao {

    @Select
    List<Person> selectAll();

    @Select
    Person selectById(Integer id);

    @Insert
    int insert(Person person);

    @Update
    int update(Person person);

    @Delete
    int delete(Person person);

}

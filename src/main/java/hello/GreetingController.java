package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import doma.AppConfig;
import doma.dao.PersonDao;
import doma.dao.PersonDaoImpl;
import doma.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by chibana on 2017/05/11.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    //@Autowired
    //PersonDao personDao;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/all")
    public List<Person> all(@RequestParam(value="name", defaultValue="World") String name) {
        PersonDao personDao = new PersonDaoImpl();
        return personDao.selectAll();
    }
}

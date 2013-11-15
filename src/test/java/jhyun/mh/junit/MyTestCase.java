package jhyun.mh.junit;

import jhyun.mh.entities.Foo;
import jhyun.mh.spring.RootContext;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mongodb.morphia.Datastore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: adaltan
 * Date: 13. 11. 14
 * Time: 오후 4:01
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootContext.class})
public class MyTestCase {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private Datastore datastore;

    @Test
    public void t_01() {
        Assert.assertNotNull(datastore);
    }

    @Test
    public void t_02() {
        final long beforeCount = datastore.find(Foo.class).countAll();
        //
        Foo foo = new Foo();
        foo.setTitle(String.format("foobar!!! %s", new Date()));
        datastore.save(foo);
        //
        final long afterCount = datastore.find(Foo.class).countAll();
        Assert.assertTrue("afterCount should greater than beforeCount!", afterCount > beforeCount);
    }
}

package jhyun.mh.spring;

import com.mongodb.DB;
import com.mongodb.DBAddress;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import jhyun.mh.entities.Foo;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: adaltan
 * Date: 13. 11. 14
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class MorphiaContext {
    private void fo() throws UnknownHostException {
        DB db = MongoClient.connect(new DBAddress("localhost", "test"));

        Morphia morphia = new Morphia(new HashSet<Class>(Arrays.asList(Foo.class)));

    }
}

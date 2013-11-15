package jhyun.mh.spring;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import jhyun.mh.entities.Foo;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: adaltan
 * Date: 13. 11. 14
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class MorphiaContext {

    @Bean
    public MongoClientOptions mongoClientOptions() {
        final MongoClientOptions.Builder builder = MongoClientOptions.builder();
        return builder.build();
    }

    @Autowired
    @Bean
    public MongoClient mongoClient(MongoClientOptions mongoClientOptions) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient("localhost", mongoClientOptions);
        return mongoClient;
    }

    @Bean
    public Morphia morphia() {
        Morphia morphia = new Morphia(new HashSet<Class>(Arrays.asList(Foo.class)));
        return morphia;
    }

    @Autowired
    @Bean
    public Datastore datastore(MongoClient mongoClient, Morphia morphia) {
        Datastore ds = morphia.createDatastore(mongoClient, "test");
        return ds;
    }

}

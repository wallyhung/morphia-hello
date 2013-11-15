package jhyun.mh.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created with IntelliJ IDEA.
 * User: adaltan
 * Date: 13. 11. 14
 * Time: 오후 5:27
 * To change this template use File | Settings | File Templates.
 */
@Entity(value = "foo")
public class Foo {
    @Id
    private ObjectId id;
    private String title;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

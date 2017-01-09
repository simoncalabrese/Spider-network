package entity.node;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Property;

/**
 * Created by simon on 09/01/17.
 */
@Label
public interface Person {

    @Property("name")
    String getName();

    void setName(String name);
}

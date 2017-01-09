package entity.node;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation.Outgoing;
import entity.relation.Buy;

import java.util.List;

/**
 * Created by simon on 09/01/17.
 */
@Label
public interface Client extends Person {

    @Buy
    @Outgoing
    List<Product> getProducts();
}

package entity.node;

import com.buschmais.xo.api.Query.Result;
import com.buschmais.xo.api.annotation.ResultOf;
import com.buschmais.xo.api.annotation.ResultOf.Parameter;
import com.buschmais.xo.neo4j.api.annotation.Cypher;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation.Outgoing;
import entity.relation.Sell;

import java.util.List;

/**
 * Created by simon on 09/01/17.
 */
@Label
public interface Employee extends Person{

    @Sell
    @Outgoing
    List<Product> getProducts();

    @ResultOf
    @Cypher("match (p:Product)<-[SELL]-(e:Employee) where e.name = {name} return p")
    Result<Product> getSelledProductsByEmployee(@Parameter("name") String name);
}

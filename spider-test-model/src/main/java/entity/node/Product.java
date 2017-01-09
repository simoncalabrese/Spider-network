package entity.node;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation.Incoming;
import entity.relation.Buy;
import entity.relation.Sell;

import java.util.List;

/**
 * Created by simon on 09/01/17.
 */
@Label
public interface Product {
    String getName();
    Double getPrice();

    @Sell
    @Incoming
    List<Employee> getEmployees();

    @Buy
    @Incoming
    List<Client> getClients();

    void setName(String name);
    void setPrice(Double price);
}

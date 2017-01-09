package entity.relation;

import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by simon on 09/01/17.
 */

@Relation("BUY")
@Retention(RUNTIME)
public @interface Buy {
}

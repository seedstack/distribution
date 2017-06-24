package ${package}.domain.model;

import org.seedstack.business.domain.BaseAggregateRoot;

{% if persistence.type == "jpaHibernate" %}
import javax.persistence.Entity;
import javax.persistence.Id;
{% endif %}

{% if persistence.type == "jpaHibernate" %}
@Entity
{% endif %}
public class Aggregate1 extends BaseAggregateRoot<String> {
    {% if persistence.type == "jpaHibernate" %}
    @Id
    {% endif %}
    private String id;

    public Aggregate1(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}

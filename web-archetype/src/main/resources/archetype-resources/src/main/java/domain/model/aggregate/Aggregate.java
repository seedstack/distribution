package {{ project.package }}.domain.model.aggregate;

import org.seedstack.business.domain.BaseAggregateRoot;

{% if persistence.type == "jpaHibernate" %}
import javax.persistence.Entity;
import javax.persistence.Id;
{% elseif persistence.type == "mongo" %}
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
{% endif %}

{% if persistence.type == "jpaHibernate" or persistence.type == "mongo" %}
@Entity
{% endif %}
public class Aggregate extends BaseAggregateRoot<String> {
{% if persistence.type == "jpaHibernate" or persistence.type == "mongo" %}
    @Id
{% endif %}
    private String id;

{% if persistence.type == "jpaHibernate" or persistence.type == "mongo" %}
    private Aggregate() {
        // required by persistence implementation
    }
{% endif %}

    public Aggregate(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}

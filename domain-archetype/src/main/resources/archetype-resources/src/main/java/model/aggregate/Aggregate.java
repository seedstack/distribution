package ${package}.model.aggregate;

import org.seedstack.business.domain.BaseAggregateRoot;

public class Aggregate extends BaseAggregateRoot<Long> {
    private Long id;

    public Aggregate(Long id) {
        this.id = id;
    }

    @Override
    public Long getEntityId() {
        return id;
    }
}

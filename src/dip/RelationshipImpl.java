package dip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class RelationshipImpl implements Relationship {

    private List<Person> relations = new ArrayList<>();

    @Override
    public void addParentAndChild(Person person) {
        relations.add(person);
    }

    public List<Person> findAllChildrenOf(Person person) {
        return relations.stream()
                .filter(filter -> filter.role.equals(Role.CHILD))
                .collect(Collectors.toList());
    }
}
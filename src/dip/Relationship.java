package dip;

import java.util.List;

public interface Relationship {
    void addParentAndChild (Person person);
    List<Person> findAllChildrenOf(Person person);
}

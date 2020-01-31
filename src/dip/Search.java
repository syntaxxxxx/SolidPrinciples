package dip;

import java.util.List;

public class Search {

    Search(Person parent, Relationship relationship) {
        List<Person> children = relationship.findAllChildrenOf(parent);
        for (Person child : children)
            System.out.println(parent.name + " punya anak namanya " + child.name);
    }

    @Override
    public String toString() {
        return "";
    }
}
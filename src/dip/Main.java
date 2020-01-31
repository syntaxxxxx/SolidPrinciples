package dip;

class Main {
    public static void main(String[] args) {
        Person parent = new Person("Agus", Role.PARENT);
        Person child1 = new Person("Rina", Role.CHILD);
        Person child2 = new Person("Dia", Role.CHILD);

        RelationshipImpl relationshipImpl = new RelationshipImpl();
        relationshipImpl.addParentAndChild(parent);
        relationshipImpl.addParentAndChild(child1);
        relationshipImpl.addParentAndChild(child2);

        Search search = new Search(parent, relationshipImpl);
        System.out.println(search);
    }
}

class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String namep1 = p1.name;
        String namep2 = p2.name;
        int agep1 = p1.age;
        int agep2 = p2.age;
        p1.name = namep2;
        p2.name = namep1;
        p1.age = agep2;
        p2.age = agep1;


    }
}
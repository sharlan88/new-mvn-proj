package model;

public class PersonEqualsTests {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setLName("Johnson");
        p.setAge(55);
        p.setId(100);

        Person p2 = new Person(100, "John", "Johnson", 55);

        // I.
        System.out.println("p == p2 ? " + (p == p2) );

        Person p100 = p;
        System.out.println("p100 == p ? " + (p100 == p) );
        p2 = p;
        System.out.println("p2 == p100 ? " + (p2 == p100) );

        Person pp = new Person();
        p100 = pp;
        System.out.println("p100 == pp ? " + (p100 == pp) );

        // II equals.

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Murzik");

        Person person1 = new Person(123, "Mike", "Tyson", 56);
        person1.setCat(cat1);

        Person person2 = new Person(123, "Mike", "Tyson", 56);
        person2.setCat(cat2);

        //
        System.out.println("person1 equals person2 ? " + person1.equals(person2));


        // HashCode -
        System.out.println("cat1 hashCode : " + cat1.hashCode());
        System.out.println("cat2 hashCode : " + cat2.hashCode());

        System.out.println("person1 hashCode : " + person1.hashCode());
        System.out.println("person2 hashCode : " + person2.hashCode());

    }

}

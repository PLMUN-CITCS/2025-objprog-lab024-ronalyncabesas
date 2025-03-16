class Person {
    // Code will go here
}
class Person {
    String name;
    int age;
}
class Person {
    //... (attributes)...

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Person {
    //... (attributes and parameterized constructor)...

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
}
class Person {
    //... (attributes and constructors)...

    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        // Code will go here
    }
}
Person person1 = new Person("Bob", 30);
Person person2 = new Person();
person1.displayPerson();
person2.displayPerson();
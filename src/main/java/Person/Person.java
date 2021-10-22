package Person;

public class Person {
    private String name;
    private int age;
    private String email;
    public int id;

    public Person(PersonBuilder personBuilderBuilder) {
        this.name = personBuilderBuilder.getName();
        this.age = personBuilderBuilder.getAge();
        this.email = personBuilderBuilder.getEmail();
        this.id = personBuilderBuilder.getId();
    }
}

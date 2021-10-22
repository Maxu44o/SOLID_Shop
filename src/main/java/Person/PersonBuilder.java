package Person;

public class PersonBuilder{
    private String name;
    private int age;
    private String email;
    private int id;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected String getEmail() {
        return email;
    }

    protected int getId() {
        return id;
    }

    public Customer builtCustomer() throws IllegalStateException {
        if (this.name == null) {
            throw new IllegalStateException("No name info");
        }

        IdGenerator generator = IdGenerator.getGenerator();
        id = generator.generateId();

        return new Customer(this);


    }

    public Employee builtEmployee() throws IllegalStateException {
        if (this.name == null) {
            throw new IllegalStateException("No name info");
        }

        return new Employee(this);
    }

}

package Person;

public class IdGenerator {
    private static int id = 0;
    private static IdGenerator generator = null;

    private IdGenerator() {
    }

    public static IdGenerator getGenerator() {
        if (generator == null) generator = new IdGenerator();
        return generator;
    }

    public int generateId() {
        id++;
        return id;
    }

}

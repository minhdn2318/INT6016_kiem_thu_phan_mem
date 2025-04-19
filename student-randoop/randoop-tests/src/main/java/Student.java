public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        if (id == null || name == null) throw new IllegalArgumentException("null not allowed");
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

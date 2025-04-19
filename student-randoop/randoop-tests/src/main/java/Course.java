public class Course {
    private String code;
    private String name;

    public Course(String code, String name) {
        if (code == null || name == null) throw new IllegalArgumentException("null not allowed");
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}

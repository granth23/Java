import java.io.Serializable;

public class Object implements Serializable{
    private String name;
    private String description;

    public Object(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

    public String print() {
        return "Name: " + name + "\nDescription: " + description;
    }
}

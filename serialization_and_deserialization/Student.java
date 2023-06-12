import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Student implements Serializable{
    private final String id;
    private final String name;
    private final String add;

    Student(String id, String name, String add){
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

}
/**
 * Created by Joe on 7/26/17.
 */
public class Student {
    // FIELDS
    private String firstName;
    private String lastName;
    private int id;
    private int grade;

    // CONSTRUCTORS
    public Student () {}

    // METHODS
    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

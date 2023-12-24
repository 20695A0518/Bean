import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private List<String> roles;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", roles=" + roles +
                '}';
    }


    public Person(String firstName, String lastName, String email, String city, List<String> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public List<String> getRoles() {
        return roles;
    }
}

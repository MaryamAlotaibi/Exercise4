public class author {
    String name;
    String email;

    public author(String name,  String email) {
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

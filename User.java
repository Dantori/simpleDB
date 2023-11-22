public class User {
    
    private final long id;
    private final String username;
    private final String password;

    private User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public static User addUser(long id, String username, String password) {
        return new User(id, username, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", username='" + this.username + '\'' +
                ", password='" + this.password + '\'' +
                '}';
    }
}

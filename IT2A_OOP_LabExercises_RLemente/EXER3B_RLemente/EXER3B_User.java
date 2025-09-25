public class EXER3B_User {
    private String name;
    private String username;
    private String password;

    public EXER3B_User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println(name + " logged in successfully!");
    }

    public void showHome() {
        System.out.println("Welcome " + name + "! This is the default home page.");
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package DemoKJ.domain;

/**
 * Created by Dw.L on 2017/3/27.
 *
 *
 * domain主要用于储存数据库查询到的数据
 */
public class User {
   private String Username;
    private String Password;



    public User() {
    }

    public User(String username, String password) {
        Username = username;
        Password = password;
    }



    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }




}

package cn.dw.domain;

/**
 * Created by Dw.L on 2017/3/28.
 *
 * 实体类  储存数据库取出的东西
 */
public class User {
    private String username;
    private String passward;
    private String verifyCode;



    public User(String username, String passward) {
        this.username = username;
        this.passward = passward;
    }

    public User() {
    }


    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passward='" + passward + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                '}';
    }

}

package user;

/**
 * Created by Dw.L on 2017/4/14.
 */
public class customer {
    String cid;
    String canme;
    String cphone;
    String sex;

    public customer(String cid, String canme, String cphone, String sex) {
        this.cid = cid;
        this.canme = canme;
        this.cphone = cphone;
        this.sex = sex;
    }

    public customer(){}

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCanme() {
        return canme;
    }

    public void setCanme(String canme) {
        this.canme = canme;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

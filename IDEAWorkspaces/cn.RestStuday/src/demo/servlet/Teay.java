package demo.servlet;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class Teay {
    public static void main(String[] args) {

        String sql = "SELECT * FROM A WHERE A_ID IN (SELECT B_ID FROM B)";

        String sql2 = "SELECT A_ID,B_ID FROM A,B WHERE A_ID = B_ID";

    }

}

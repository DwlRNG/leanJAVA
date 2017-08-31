package daomain;

import java.util.List;

/**
 * Created by Dw.L on 2017/6/12.
 */
public class PageBean<T> {



    private int pc;//当前页码    JSP传递
    private int tr;//总记录数   数据库查询出总共有多少条
    private int ps;//每页记录数   定制
    private List<T> beanList;//当前页面记录数


    public int getTp(){  // 总页数
        int tp = tr/ps;
        return tp%ps==0 ? tp:tp+1;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public List <T> getBeanList() {
        return beanList;
    }

    public void setBeanList(List <T> beanList) {
        this.beanList = beanList;
    }



    /**   条件    */
    private int home_id;
    private String name;


    public int getHome_id() {
        return home_id;
    }

    public void setHome_id(int home_id) {
        this.home_id = home_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

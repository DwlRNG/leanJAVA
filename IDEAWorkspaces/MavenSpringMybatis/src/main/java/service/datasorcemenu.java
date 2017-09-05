package service;



import dao.find;

/**
 * Created by Dw.L on 2017/9/5.
 */


public class datasorcemenu {

    find find;

    public void setFind(dao.find find) {
        this.find = find;
    }


    public void find(){

        find.findone();
    }
}

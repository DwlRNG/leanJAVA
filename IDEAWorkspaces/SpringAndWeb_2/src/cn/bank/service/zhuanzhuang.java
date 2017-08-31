package cn.bank.service;

import cn.bank.dao.dao;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dw.L on 2017/5/2.
 */



@Transactional   //事务注解

public class zhuanzhuang {

    //将dao 作为对象注入到service中直接调用
    private dao dao;
    public void setDao(cn.bank.dao.dao dao) {
        this.dao = dao;
    }

    public void servicezuanzhang(){  //通过配置增强事务

        //少钱调用减钱的方法    业务逻辑层不对数据库进行操作

        dao.lessmoney("张三","1000");

        //多钱调用加钱的方法

        dao.moremoney("川普","1000");

    }


    public void servicezuanzhang2(){//通过注解增强事务

        //少钱调用减钱的方法    业务逻辑层不对数据库进行操作

        dao.lessmoney("张三","1000");

        //多钱调用加钱的方法

        dao.moremoney("川普","1000");

    }


}

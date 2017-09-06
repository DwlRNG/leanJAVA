package Mapper;

import Daomian.User1;

/**
 * Created by Dw.L on 2017/7/11.
 *
 * Mapper.xml 的接口
 *
 */
public interface Mapper {

    public User1 findUserById(int i) throws Exception;

}

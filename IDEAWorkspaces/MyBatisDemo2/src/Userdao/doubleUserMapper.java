package Userdao;

import java.util.List;
import Daomain.*;

/**
 * Created by Dw.L on 2017/6/20.  多表连接查询
 */
public interface doubleUserMapper {

    public List <doublepojoCustomer> findRightCityForUser(doublepojo doublepojo) throws Exception;


}

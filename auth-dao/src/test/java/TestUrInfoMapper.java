import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UrInfoDao;
import com.hzit.entity.UrInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年08月03日 - 18:41
 * |    @description   测试Ur映射配置
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestUrInfoMapper {
    public static void main(String[] args){
        SqlSession session= SqlSessionHelper.getSqlSession();
        UrInfoDao dao=session.getMapper(UrInfoDao.class);
        UrInfo urinfo=new UrInfo();

        //查询指定卡号
		/*CardInfo cardInfo=dao.findByCardId("111");
		System.out.println(cardInfo);*/
        //增加指定卡号
		/*System.out.println("利用Mybatis增加数据");
		cardInfo.setCardId("000");
		cardInfo.setOpenDate("2017-07-07");
		cardInfo.setBalance(111111);
		cardInfo.setPassword("888");
		cardInfo.setIsReportLoss("是");
		int num=dao.insertCard(cardInfo);
		session.commit();
		System.out.println("受到影响的行数为："+num);
		CardInfo cardInfo3=session.selectOne("dao.CardinfoDao.findByCardId","000");
		System.out.println("新增的一条为："+cardInfo3);*/
        //修改指定卡号信息
		/*System.out.println("将银行卡000的信息余额改为50，密码改为010");
		cardInfo.setCardId("000");
		cardInfo.setBalance(50);
		cardInfo.setPassword("010");
		cardInfo.setIsReportLoss("否");
		int num=dao.updateCard(cardInfo);
		session.commit();
		System.out.println("受到影响的行数为："+num);
		CardInfo cardInfo3=session.selectOne("dao.CardinfoDao.findByCardId","000");
		System.out.println("修改后的一条为："+cardInfo3);*/
        //删除指定卡号
		/*int num=dao.deleteCard("000");
		session.commit();
		System.out.println("受到影响的行数为："+num);*/
        //查询所有卡号的信息
        //查询所有卡号的信息
        System.out.println("所有卡号的信息如下：");
        List<UrInfo> list=dao.findAll();
        for(UrInfo obj : list){
            System.out.println(obj);
        }
    }
}

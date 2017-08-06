import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UrInfoDao;
import com.hzit.dao.Userinfodao;
import com.hzit.entity.Resourcces;
import com.hzit.entity.UrInfo;
import com.hzit.entity.Userinfo;
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
        Userinfodao dao1=session.getMapper(Userinfodao.class);
        UrInfo urinfo=new UrInfo();

        //增加指定用户号
		/*System.out.println("利用Mybatis增加数据");
        urinfo.setUid(1);
        urinfo.setRid(3);
		int num=dao.insertUid(urinfo);
		session.commit();
		System.out.println("受到影响的行数为："+num);*/

        //根据用户号查询
        /*List<UrInfo> list1=dao.findByUid(4);
        for(UrInfo obj : list1){
            System.out.println(obj);
        }*/

        //根据角色号查询
        /*List<UrInfo> list2=dao.findByRid(4);
        for(UrInfo obj : list2){
            System.out.println(obj);
        }*/

        //修改指定用户号信息
		/*System.out.println("将用户号1的信息角色改为4");
        urinfo.setUid(1);
        urinfo.setRid(4);
		int num=dao.updateUid(urinfo);
		session.commit();
		System.out.println("受到影响的行数为："+num);*/

        //删除指定用户号
		/*int num=dao.deleteUid(1);
		session.commit();
		System.out.println("受到影响的行数为："+num);*/

        //查询所有用户号的信息
        System.out.println("所有用户号的信息如下：");
        List<UrInfo> list=dao.findAll();
        for(UrInfo obj : list){
            System.out.println(obj);
        }
        Userinfo userinfo=new Userinfo();
        userinfo.setUname("吴佳峰");
        userinfo.setUpass("1234567");
        Userinfo user = dao1.findUserNameAndPwd(userinfo);
            System.out.println(user);

        ResourccesDao dao3=session.getMapper(ResourccesDao.class);
        List<Resourcces> list1=dao3.findByResourccessByUid(2);

        for(Resourcces obj : list1){
            System.out.println(obj);
        }
    }
}

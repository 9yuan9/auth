import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月03日 - 17:18
 * |    @description   用户接口
 * +---------------------------------Oooo---------------------------------------+
 */
public interface Userinfodao {
    public List<Userinfo> findUser();

    public int addUser(Userinfo userinfo);

    public int updateUser(Userinfo userinfo);

    public int deleteUser(String uid);

}

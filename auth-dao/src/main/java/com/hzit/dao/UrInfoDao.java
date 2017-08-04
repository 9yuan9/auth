package com.hzit.dao;

import com.hzit.entity.UrInfo;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年08月03日 - 17:28
 * |    @description   用户角色关联表接口
 * +---------------------------------Oooo---------------------------------------+
 */
public interface UrInfoDao {
    public List<UrInfo> findAll();
    public List<UrInfo> findByUid(int uid);
    public List<UrInfo> findByRid(int rid);
    public int insertUid(UrInfo urinfo);
    public int updateUid(UrInfo urinfo);
    public int deleteUid(int uid);
}

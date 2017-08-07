package com.hzit.dao;

import com.hzit.entity.Roleinfo;

import java.util.List;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月03日 - 18:52
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public interface RoleinfoDao {
    public List<Roleinfo> findAll();

    public Roleinfo findByRoleId(int roleId);

    public int addRole(Roleinfo roleinfo);

    public int updateRole(Roleinfo roleinfo);

    public int deleteRole(String roleId);
}

package com.hzit.dao;

import com.hzit.entity.RoleResource;

import java.util.List;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月03日 - 18:52
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public interface RoleResourceDao {
    public List<RoleResource> findAll();
    public RoleResource findByRoleid(int roleid);
    public RoleResource findByResourceid(int resourceid);
    public int update(RoleResource roleResource);
    public int delete(String roleid);
}

package com.hzit.dao;

import com.hzit.entity.Roleinfo;

import java.util.List;

/**
 * Created by acer on 2017/8/3.
 */
public interface RoleinfoDao {
    public List<Roleinfo> findAll();
    public Roleinfo findByRoleId(String roleId);
    public int addRole(Roleinfo roleinfo);
    public int updateRole(Roleinfo roleinfo);
    public int deleteRole(String roleId);
}

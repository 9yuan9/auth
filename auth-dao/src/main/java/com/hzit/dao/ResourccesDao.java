package com.hzit.dao;/**
 * Created by 响 on 2017/8/3.
 */

import com.hzit.entity.Resourcces;

import java.util.List;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017/8/3 19:06
 * |  @ResourccesDao
 * +---------------------------------Oooo---------------------------------------+
 */
public interface ResourccesDao {
    public List<Resourcces> findAll();
    public Resourcces findByResourccessId(int ResourccessId);
    public List<Resourcces> findAllResourccesByUid(int uid);
    public int addResourcces(Resourcces resourcces);
    public int updateResourccess(Resourcces resourcces);
    public int deleteResourccess(String rid);
    public List<Resourcces> findByResourccessByUid(int uid);
}

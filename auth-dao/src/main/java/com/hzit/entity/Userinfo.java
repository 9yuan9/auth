package com.hzit.entity;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月03日 - 17:14
 * |    @description   用户实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Userinfo {
    private int uid;
    private String uname;
    private String upass;
    private String ustatus;
    private String weixinhao;
    private String createTime;
    private WeixinInfo weixinInfo;

    @Override
    public String toString() {
        return "Userinfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", ustatus='" + ustatus + '\'' +
                ", weixinhao='" + weixinhao + '\'' +
                ", createTime='" + createTime + '\'' +
                ", weixinInfo=" + weixinInfo +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public String getWeixinhao() {
        return weixinhao;
    }

    public void setWeixinhao(String weixinhao) {
        this.weixinhao = weixinhao;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public WeixinInfo getWeixinInfo() {
        return weixinInfo;
    }

    public void setWeixinInfo(WeixinInfo weixinInfo) {
        this.weixinInfo = weixinInfo;
    }
}

package com.hzit.entity;

/**
 * Created by Administrator on 2017/8/6.
 */
public class WeixinInfo {
    private String weixinhao;
    private String weixinnicheng;
    private String weixinimage;
    private Userinfo userinfo;

    @Override
    public String toString() {
        return "WeixinInfo{" +
                "weixinhao='" + weixinhao + '\'' +
                ", weixinnicheng='" + weixinnicheng + '\'' +
                ", weixinimage='" + weixinimage + '\'' +
                ", userinfo=" + userinfo +
                '}';
    }

    public String getWeixinhao() {
        return weixinhao;
    }

    public void setWeixinhao(String weixinhao) {
        this.weixinhao = weixinhao;
    }

    public String getWeixinnicheng() {
        return weixinnicheng;
    }

    public void setWeixinnicheng(String weixinnicheng) {
        this.weixinnicheng = weixinnicheng;
    }

    public String getWeixinimage() {
        return weixinimage;
    }

    public void setWeixinimage(String weixinimage) {
        this.weixinimage = weixinimage;
    }

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }
}

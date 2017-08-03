package hzit.entity;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月03日 - 17:14
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Roleinfo {
    private int rid;
    private String rname;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "Roleinfo{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }
}

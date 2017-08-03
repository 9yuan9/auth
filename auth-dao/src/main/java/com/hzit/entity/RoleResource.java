package hzit.entity;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月03日 - 17:53
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class RoleResource {
    private int roleid;
    private int resourceid;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getResourceid() {
        return resourceid;
    }

    public void setResourceid(int resourceid) {
        this.resourceid = resourceid;
    }

    @Override
    public String toString() {
        return "RoleResource{" +
                "roleid=" + roleid +
                ", resourceid=" + resourceid +
                '}';
    }
}

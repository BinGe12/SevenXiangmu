package com.jk.model;

import java.io.Serializable;

/**
 * Created by Mr.wangbin on 2017/11/14.
 */
public class MenuTree implements Serializable {

    private static final long serialVersionUID = -9165863351814256356L;
    private Integer id;
    private String text;//节点名称
    private String state;//节点展开状态
    private Integer pid;//父节点id
    private boolean checked;//收否默认被选中
    private String url;//节点连接


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuTree menuTree = (MenuTree) o;

        return id.equals(menuTree.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "MenuTree{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", state='" + state + '\'' +
                ", pid=" + pid +
                ", checked=" + checked +
                ", url='" + url + '\'' +
                '}';
    }
}

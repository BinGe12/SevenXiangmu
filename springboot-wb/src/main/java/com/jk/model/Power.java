package com.jk.model;

import java.io.Serializable;

public class Power implements Serializable {

	private static final long serialVersionUID = -3044811173915560959L;

	private Integer id;
	
	private String name;
	
	private String icon;
	
	private String url;
	
	private String target;
	
	private String type;
	
	private Integer pid;
	
	private String open = "true";
	
	private String isParent = "false";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getIsParent() {
		return isParent;
	}

	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Power power = (Power) o;

		return id.equals(power.id);

	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Power{" +
				"id=" + id +
				", name='" + name + '\'' +
				", icon='" + icon + '\'' +
				", url='" + url + '\'' +
				", target='" + target + '\'' +
				", type='" + type + '\'' +
				", pid=" + pid +
				", open='" + open + '\'' +
				", isParent='" + isParent + '\'' +
				'}';
	}
}

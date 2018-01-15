package com.pojo.user;

/**
 * Created by WUGUOKAI on 2017/12/13.
 */

public class Project {
    private Long id;
    private String name;
    private Long organizetionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrganizetionId() {
        return organizetionId;
    }

    public void setOrganizetionId(Long organizetionId) {
        this.organizetionId = organizetionId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", organizetionId=" + organizetionId +
                '}';
    }
}

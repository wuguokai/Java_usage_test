package com.pojo.user;

import java.util.Arrays;

/**
 * Created by WUGUOKAI on 2017/12/8.
 */

public class UserPojo {
    private Organization currentOrganization;
    private Project currentProject;
    private Project[] latestProjects;

    public Organization getCurrentOrganization() {
        return currentOrganization;
    }

    public void setCurrentOrganization(Organization currentOrganization) {
        this.currentOrganization = currentOrganization;
    }

    public Project getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(Project currentProject) {
        this.currentProject = currentProject;
    }

    public Project[] getLatestProjects() {
        return latestProjects;
    }

    public void setLatestProjects(Project[] latestProjects) {
        this.latestProjects = latestProjects;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "currentOrganization=" + currentOrganization +
                ", currentProject=" + currentProject +
                ", latestProjects=" + Arrays.toString(latestProjects) +
                '}';
    }
}

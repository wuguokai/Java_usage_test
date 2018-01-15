package com.pojo.update;

import java.util.HashMap;
import java.util.Map;

/**
 * bundle.update.json配置文件对应的对象
 *
 * Created by WUGUOKAI on 2017/8/30.
 */

public class AppUpdatePojo {
    private Long appVersionId;//app的id
    private String name;
    private String version;
    private Boolean updateAble;
    private String url;
    private String targetVersion;
    private Map<String, Long> mainBundleIdMap = new HashMap<String, Long>();
    private Map<String, BundleUpdatePojo> mainBundleUpdate = new HashMap<String, BundleUpdatePojo>(); ;
    private Map<String, BundleUpdatePojo> bundlesUpdate = new HashMap<String, BundleUpdatePojo>();

    public Long getAppVersionId() {
        return appVersionId;
    }

    public void setAppVersionId(Long appVersionId) {
        this.appVersionId = appVersionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getUpdateAble() {
        return updateAble;
    }

    public void setUpdateAble(Boolean updateAble) {
        this.updateAble = updateAble;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public Map<String, Long> getMainBundleIdMap() {
        return mainBundleIdMap;
    }

    public void setMainBundleIdMap(Map<String, Long> mainBundleIdMap) {
        this.mainBundleIdMap = mainBundleIdMap;
    }

    public Map<String, BundleUpdatePojo> getMainBundleUpdate() {
        return mainBundleUpdate;
    }

    public void setMainBundleUpdate(Map<String, BundleUpdatePojo> mainBundleUpdate) {
        this.mainBundleUpdate = mainBundleUpdate;
    }

    public Map<String, BundleUpdatePojo> getBundlesUpdate() {
        return bundlesUpdate;
    }

    public void setBundlesUpdate(Map<String, BundleUpdatePojo> bundlesUpdate) {
        this.bundlesUpdate = bundlesUpdate;
    }

    @Override
    public String toString() {
        return "AppUpdatePojo{" +
                "appVersionId=" + appVersionId +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", updateAble=" + updateAble +
                ", url='" + url + '\'' +
                ", targetVersion='" + targetVersion + '\'' +
                ", mainBundleIdMap=" + mainBundleIdMap +
                ", mainBundleUpdate=" + mainBundleUpdate +
                ", bundlesUpdate=" + bundlesUpdate +
                '}';
    }
}
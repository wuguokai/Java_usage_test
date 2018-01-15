package com.pojo.update;

/**
 * update的bundle信息
 *
 * Created by WUGUOKAI on 2017/8/30.
 */

public class BundleUpdatePojo {
    private Long bundleId;//每个模块的id
    private String name;
    private String targetVersion;
    private Long bundleVersionId;
    private String downloadUrl;

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public Long getBundleVersionId() {
        return bundleVersionId;
    }

    public void setBundleVersionId(Long bundleVersionId) {
        this.bundleVersionId = bundleVersionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return "BundleUpdatePojo{" +
                "bundleId=" + bundleId +
                ", name='" + name + '\'' +
                ", targetVersion='" + targetVersion + '\'' +
                ", bundleVersionId=" + bundleVersionId +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }
}

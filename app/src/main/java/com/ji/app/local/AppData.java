package com.ji.app.local;

public class AppData {
    public String iconUrl;
    public String name;
    public String detail;
    public String packageName;
    public long versionCode;
    public String apkUrl;
    public long fileSize;
    public long downloadSize;
    public int state;

    @Override
    public boolean equals(Object object) {
        return object instanceof AppData && ((AppData) object).packageName.equals(packageName);
    }

    @Override
    public String toString() {
        return "AppData iconUrl:" + iconUrl
                + " name:" + name
                + " detail:" + detail
                + " packageName:" + packageName
                + " versionCode:" + versionCode
                + " apkUrl:" + apkUrl
                + " fileSize:" + fileSize
                + " downloadSize:" + downloadSize
                + " state:" + state;
    }
}

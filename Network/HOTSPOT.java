package com.personal.Network;

public enum HOTSPOT {
    // 正在关闭
    WIFI_AP_STATE_DISABLING(10),
    // 已关闭
    WIFI_AP_STATE_DISABLED(11),
    // 正在开启
    WIFI_AP_STATE_ENABLING(12),
    // 已开启
    WIFI_AP_STATE_ENABLED(13),
    //错误状态
    WIFI_AP_STATE_FAILED(14);

    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    HOTSPOT(int value) {
        this.value = value;
    }

    public static HOTSPOT getType(int value) {
        for (HOTSPOT hotspot : HOTSPOT.values()) {
            if (hotspot.getValue() == value) {
                return hotspot;
            }
        }
        return null;
    }
}

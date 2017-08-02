package com.example.parsinggson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Beyza on 2.08.2017.
 */

public class Device {

    @SerializedName("deviceName")
    @Expose
    private String deviceName;

    @SerializedName("deviceType")
    @Expose
    private String deviceType;

    @SerializedName("deviceStatus")
    @Expose
    private String deviceStatus;


    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

}

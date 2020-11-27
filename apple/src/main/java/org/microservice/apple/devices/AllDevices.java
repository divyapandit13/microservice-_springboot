package org.microservice.apple.devices;

import java.util.ArrayList;
import java.util.List;

public class AllDevices {
    List<Device> allDevices = new ArrayList<Device>();
    String brandName = "";
    public AllDevices() {
    }

    public AllDevices(List<Device> allDevices, String brandName) {
        this.allDevices = allDevices;
        this.brandName = brandName;
    }

    public List<Device> getAllDevices() {
        return allDevices;
    }

    public void setAllDevices(List<Device> allDevices) {
        this.allDevices = allDevices;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "AllDevices{" +
                "allDevices=" + allDevices +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}

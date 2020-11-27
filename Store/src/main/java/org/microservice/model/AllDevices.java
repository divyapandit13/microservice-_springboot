package org.microservice.model;

import java.util.ArrayList;
import java.util.List;

public class AllDevices {
    List<Device> allDevices = new ArrayList<Device>();
    String brandName = "Samsung";
    public AllDevices() {
    }

    public AllDevices(List<Device> allDevices) {
        this.allDevices = allDevices;
    }

    public List<Device> getAllDevices() {
        return allDevices;
    }

    public void setAllDevices(List<Device> allDevices) {
        this.allDevices = allDevices;
    }

    @Override
    public String toString() {
        return "AllDevices{" +
                "allDevices=" + allDevices +
                '}';
    }
}

package org.microservice.apple.resource;

import org.microservice.apple.devices.AllDevices;
import org.microservice.apple.devices.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/device")
    public AllDevices getDevices(){
        List<Device> device = new ArrayList<Device>();
        device.add(new Device("12pro","Smartphone"));
        device.add(new Device("Iphone11","Smartphone"));
        AllDevices allDeviceList = new AllDevices(device);
        return allDeviceList;
    }
}

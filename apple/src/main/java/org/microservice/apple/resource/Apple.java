package org.microservice.apple.resource;

import org.microservice.apple.devices.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/devices")
    public List<Device> getDevices(){
        List<Device> devices = new ArrayList<Device>();
        devices.add(new Device("12pro","Smartphone"));
        devices.add(new Device("Iphone11","Smartphone"));
        return devices;
    }
}

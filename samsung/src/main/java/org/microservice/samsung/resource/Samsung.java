package org.microservice.samsung.resource;

import org.microservice.samsung.device.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @RequestMapping("/devices")
    public List<Device> getDevices(){
        List<Device> devices = new ArrayList<Device>();
        devices.add(new Device("Note9","Smartphone"));
        devices.add(new Device("A50s","Smartphone"));
        return devices;
    }
}

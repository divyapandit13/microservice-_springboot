package org.microservice.samsung.resource;

import org.microservice.samsung.device.AllDevices;
import org.microservice.samsung.device.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @RequestMapping("/device")
    public AllDevices getDevices(){
        List<Device> device = new ArrayList<Device>();
        device.add(new Device("Note9","Smartphone"));
        device.add(new Device("A50s","Smartphone"));

        AllDevices allDevicesList = new AllDevices(device,"samsung");
        return allDevicesList;
    }
}

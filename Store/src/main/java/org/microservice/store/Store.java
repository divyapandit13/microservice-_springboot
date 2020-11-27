package org.microservice.store;

import org.microservice.model.AllDevices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Store {

@RequestMapping("/")
public String home() {
	return "home";
}
@RequestMapping("/samsung")
public ModelAndView samsung() {
	
	ModelAndView modelandview = new ModelAndView("samsung");
	//connect with microservice
	RestTemplate restTemplate = new RestTemplate();
	AllDevices result = restTemplate.getForObject("http://localhost:8082/samsung/devices", AllDevices.class);
	modelandview.addObject("devices",result);
	
	
	return modelandview;
}



@RequestMapping("/apple")
public ModelAndView apple() {
	
	ModelAndView modelandview = new ModelAndView("samsung");
	//connect with microservice
	RestTemplate restTemplate = new RestTemplate();
	AllDevices result = restTemplate.getForObject("http://localhost:8083/apple/devices", AllDevices.class);
	modelandview.addObject("devices",result);
	
	
	return modelandview;
}

}

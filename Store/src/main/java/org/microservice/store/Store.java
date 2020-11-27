package org.microservice.store;
import javax.websocket.server.PathParam;

import org.microservice.model.AllDevices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Store {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/{brandname}")
	public ModelAndView samsung(@PathVariable("brandname") String brandname) {
		ModelAndView modelandview;
		RestTemplate restTemplate;
		AllDevices result;
		
		switch (brandname.toLowerCase()) {
		case "samsung": 
		
		modelandview = new ModelAndView("samsung");
		restTemplate = new RestTemplate();
		result = restTemplate.getForObject("http://localhost:8082/samsung/devices", AllDevices.class);
		modelandview.addObject("devices",result);
		return modelandview;


		case "apple":
			
		modelandview = new ModelAndView("apple");
		restTemplate = new RestTemplate();
		result = restTemplate.getForObject("http://localhost:8083/apple/devices", AllDevices.class);
		modelandview.addObject("devices",result);
		return modelandview;

		default:
			return new ModelAndView("redirect: /error");
		}

	}
	

}

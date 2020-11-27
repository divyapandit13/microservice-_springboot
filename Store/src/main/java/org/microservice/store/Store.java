package org.microservice.store;
import org.microservice.model.AllDevices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Store {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName) {
		ModelAndView modelAndView;
		RestTemplate restTemplate;
		AllDevices result;
		switch (brandName.toLowerCase()) {
		case "samsung":
			modelAndView = new ModelAndView("samsung");
			restTemplate = new RestTemplate();
			result = restTemplate.getForObject("http://localhost:8082/samsung/device", AllDevices.class);
		    modelAndView.addObject("devices", result);
			return modelAndView;
			
       case "apple":
    	    modelAndView = new ModelAndView("apple");
		    restTemplate = new RestTemplate();
			result = restTemplate.getForObject("http://localhost:8083/apple/device", AllDevices.class);
		    modelAndView.addObject("devices", result);
			return modelAndView;

		default:
			return new ModelAndView("redirect: /error");
		}	
	}
	
	


}
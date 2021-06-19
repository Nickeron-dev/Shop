package com.shop.Shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	// Categories
	@GetMapping("/smartphones")
	public String smartphones() {
		return "smartphones";
	}
	
	@GetMapping("/tablets")
	public String tablets() {
		return "tablets";
	}
	
	@GetMapping("/laptops")
	public String laptops() {
		return "laptops";
	}
	
	@GetMapping("/computers")
	public String computers() {
		return "computers";
	}
	
	@GetMapping("/cameras")
	public String cameras() {
		return "cameras";
	}
	
	@GetMapping("/monowheels")
	public String monowheels() {
		return "monowheels";
	}
	
	@GetMapping("/scooters")
	public String scooters() {
		return "scooters";
	}
	
	@GetMapping("/speakers")
	public String speakers() {
		return "speakers";
	}
	
	
	// Goods
	@GetMapping("/smartphones/iphone12")
	public String iphone12() {
		return "iphone12";
	}
	
	@GetMapping("/smartphones/iphoneXS")
	public String iphoneXS() {
		return "iphoneXS";
	}
	
	@GetMapping("/smartphones/iphoneSE2")
	public String iphoneSE2() {
		return "iphoneSE2";
	}
	
	@GetMapping("/smartphones/onePlus9")
	public String onePlus9() {
		return "onePlus9";
	}
	
	@GetMapping("/smartphones/samsungS21")
	public String samsungS21() {
		return "samsungS21";
	}
	
	@GetMapping("/smartphones/redmi9T")
	public String redmi9T() {
		return "redmi9T";
	}
}

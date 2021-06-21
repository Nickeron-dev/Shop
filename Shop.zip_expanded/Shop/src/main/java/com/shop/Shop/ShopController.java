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
	
	// Smartphones
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
	
	// Tablets
	@GetMapping("/tablets/ipadAir109")
	public String ipadAir109() {
		return "ipadAir109";
	}
	
	@GetMapping("/tablets/ipadMini5")
	public String ipadMini5() {
		return "ipadMini5";
	}
	
	@GetMapping("/tablets/ipadM1")
	public String ipadM1() {
		return "ipadM1";
	}
	
	// Laptops
	@GetMapping("/laptops/macbook-air-m1")
	public String macbookAirM1() {
		return "macbookAirM1";
	}
	
	@GetMapping("/laptops/macbook-pro-m1")
	public String macbookProM1() {
		return "macbookProM1";
	}
	
	@GetMapping("/laptops/macbook-pro-16")
	public String macbookPro16() {
		return "macbookPro16";
	}
	
	@GetMapping("/laptops/dellXPS13")
	public String dellXPS13() {
		return "dellXPS13";
	}
	
	@GetMapping("/laptops/dellXPS15")
	public String dellXPS15() {
		return "dellXPS15";
	}
	
	// Computers
	@GetMapping("computers/mac-mini-m1")
	public String macMiniM1() {
		return "macMiniM1";
	}
	
	@GetMapping("computers/mac2020")
	public String mac2020() {
		return "mac2020";
	}
	
	@GetMapping("computers/macM1")
	public String macM1() {
		return "macM1";
	}
	
	// Cameras
	@GetMapping("/cameras/djiPocket2")
	public String djiPocket2() {
		return "djiPocket2";
	}
	
	@GetMapping("/cameras/xiaomiSeabird")
	public String xiaomiSeabird() {
		return "xiaomiSeabird";
	}
	
	@GetMapping("/cameras/goPro9")
	public String goPro9() {
		return "goPro9";
	}
	
	// Monowheels
	@GetMapping("monowheels/inmotionV8")
	public String inmotionV8() {
		return "inmotionV8";
	}
	
	@GetMapping("monowheels/inmotionV10F")
	public String inmotionV10F() {
		return "inmotionV10F";
	}
	
	@GetMapping("monowheels/ninebotZ10")
	public String ninebotZ10() {
		return "ninebotZ10";
	}
	
	// Scooters
	@GetMapping("scooters/scooter1s")
	public String scooter1s() {
		return "scooter1s";
	}
	
	@GetMapping("scooters/ninebotE10")
	public String ninebotE10() {
		return "ninebotE10";
	}
	
	@GetMapping("scooters/ninebotE45E")
	public String ninebotE45E() {
		return "ninebotE45E";
	}
}

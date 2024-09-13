package com.automationbuilding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Automation")
public class Controller {
     @GetMapping(value="/getAutomation")
     public String get() {
    	 return "AutomationBuilding";
     }
}

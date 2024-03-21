package com.gymcompany.Gymapp;





import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin
public class ControllerTest {
    
    @RequestMapping(value = "/test", produces = "application/json")
    @ResponseBody // Ensure that the response is serialized to JSON
    public ArrayList<String> test() {
        System.out.println("signal coming in /test");
        ArrayList<String> dataContainer = new ArrayList<String>();
        dataContainer.add("data1");
        dataContainer.add("data2");
        dataContainer.add("data3");
        return dataContainer;    
    }
    
    @RequestMapping(value = "/test1", produces = "application/json")
    @ResponseBody // Ensure that the response is serialized to JSON
    public String test1() {
        System.out.println("signal coming in /test1");
        String str = "hello1~";
        return str;    
    }
    
    @RequestMapping(value = "/test2")
    @ResponseBody // Ensure that the response is serialized to JSON
    public String test2() {
        System.out.println("signal coming in /test2");
        return "hello2~";    
    }
    
    
   
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        System.out.println("Login attempt with Username: " + username + " Password: " + password);
        
        // Here you can add your logic to verify the username and password
        
        return "Login successful for: " + username;
    }
    
}

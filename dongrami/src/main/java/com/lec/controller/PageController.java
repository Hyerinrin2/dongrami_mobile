package com.lec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
   
    
    @GetMapping("/review")
    public String reviewPage() {
        return "review";
    }
    
    @GetMapping("/mypage")
    public String myPage() {
        return "mypage";
    }
    
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @GetMapping("/mainvote")
    public String mainvote() {
       return "mainvote";
    }
    @GetMapping("/vote")
    public String votePage() {
        return "votepage";
    }
    
    @GetMapping("/find_Id")
    public String findId() {
    	return "find_Id";
    }
    
    @GetMapping("/find_Pwd")
    public String findPwd() {
    	return "find_Pwd";
    }
    
    @GetMapping("/tarotlist")
    public String tarotlist() {
    	return "tarotlist";
    }
    
    @GetMapping("/editprofile")
    public String editprofile() {
    	return "editprofile";
    }
    
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
    @GetMapping("/tarot")
    public String tarot() {
    	return "tarot";
    }
    
    @GetMapping("/result")
    public String result() {
    	return "result";
    }
}
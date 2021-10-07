package com.hansung.financial.project.controller;

import java.io.PrintWriter;
import java.security.PrivateKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.hansung.financial.project.entity.Member;

@SuppressWarnings("deprecation")
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String dashboard() {
        return "index";
    }
    
    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public String main() {
        return "index";
    }
    
    @RequestMapping(value = "loginResult.do")
    	public void loginResult(HttpServletRequest  request, HttpServletResponse response, HttpSession session)
    			throws Exception {
    		PrintWriter out = null;
    		
    		response.setCharacterEncoding("UTF-8");

    		String quotZero = request.getParameter("param");

    		quotZero = quotZero.replaceAll("&quot;", "\"");
    		
    	  

			JsonParser parser = new JsonParser();
    	    JsonElement element = parser.parse(quotZero);

    	    String id = element.getAsJsonObject().get("loginid").getAsString();
    	    String pwd = element.getAsJsonObject().get("passwd").getAsString();
    			
    	    System.out.println("id  : " + id);
    	    System.out.println("pwd  : " + pwd);

    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    			
    			long now = System.currentTimeMillis();
    			String nowStr = sdf.format(now);
    			
    			Member members = new Member();

    		
    	
    }

    @GetMapping("/buttons")
    public String test() {
        return "buttons";
    }

    @GetMapping("/cards")
    public String cards() { return "cards"; }

    @GetMapping("/charts")
    public ModelAndView charts() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("charts");

        return mav;
    }

    @GetMapping("/forgot-password")
    public String forgot_password() { return "forgot-password"; }

    @GetMapping("/login")
    public String login() { return "login"; }

    @GetMapping("/register")
    public String register() { return "register"; }

    @GetMapping("/tables")
    public String tables() { return "tables"; }

    @GetMapping("/blank")
    public String blank() { return "blank"; }
    
    @GetMapping("/tests")
    public String tests() { return "tests"; }
    
    @GetMapping("/notice")
    public String notice() { return "notice"; }

    @GetMapping("/utilities-animation")
    public String utilities_animation() { return "utilities-animation"; }

    @GetMapping("/utilities-border")
    public String utilities_border() { return "utilities-border"; }

    @GetMapping("/utilities-color")
    public String utilities_color() { return "utilities-color"; }

    @GetMapping("/utilities-other")
    public String utilities_other() { return "utilities-other"; }

    @GetMapping("/question")
    public String question() { return "question"; }

    @GetMapping("/markets-upbit")
    public String market1() { return "markets-upbit"; }

    @GetMapping("/markets-gopax")
    public String market2() { return "markets-gopax"; }

    @GetMapping("/markets-binance")
    public String market3() { return "markets-binance"; }

    @GetMapping("/bank-KB")
    public String bank1() { return "bank-KB"; }

    @GetMapping("/bank-IBK")
    public String bank2() { return "bank-IBK"; }

    @GetMapping("/bank-Woo-ri")
    public String bank3() { return "bank-Woo-ri"; }

    @GetMapping("/bank-Shinhan")
    public String bank4() { return "bank-Shinhan"; }
}

package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("index")
    public ModelAndView getIndex(){

        return new ModelAndView("index");
    }
    @RequestMapping("/staticHtml")
    public String getStatic(){

        return "static_html";
    }
    @RequestMapping("/dynamicHtml")
    public String getDynamicHtml(Model model){
        model.addAttribute("message", "嗨 我来自模板后台的数据,经过模板引擎渲染到页面");
        return "dynamic_html";
    }

    @RequestMapping("json")
    @ResponseBody
    public Map<String, Object> getJsonData(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zhu");
        map.put("age", 123);
        return map;
    }

    @RequestMapping("sendPost")
    @ResponseBody
    public Map<String, Object> getPostData(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map = new HashMap<>();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("name="+name);
        System.out.println("age="+age);

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(age)){
            map.put("message", "失败");
        }else{
            map.put("message", "成功");
        }
        return map;
    }



}

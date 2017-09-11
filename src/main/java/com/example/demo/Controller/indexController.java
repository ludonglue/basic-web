package com.example.demo.Controller;

import com.example.demo.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ludonglue on 2017/9/11.
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("/getUser")
    public ModelAndView getData(){
        ModelAndView result = new ModelAndView("userDiv");
        User u1 = new User(1,"river");
        User u2 = new User(2,"ludonglue");
        List<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);

        result.addObject("userList", userList);
        return result;
    }
}

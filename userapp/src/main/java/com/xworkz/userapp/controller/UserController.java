package com.xworkz.userapp.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    //process the request and navigate the request

    @Autowired
    UserService userService;

    public UserController() {
        System.out.println("Controller object is created.");
    }

    @RequestMapping("userapp")
    public String addUser(UserDto userDto, Model model) {
        userService.validateAndSave(userDto);
        model.addAttribute("name", userDto.getFirstName());
        return "response.jsp";
    }

    @RequestMapping("getAllUsers")
    public String getAllUsers(Model model) {
        List<UserDto> userDtos = userService.getAllUsers();

        System.out.println("Fetched users :" + userDtos);
        model.addAttribute("users", userDtos);
        return "listOfUsers.jsp";
    }

//    @RequestMapping("delete")
//    //@RequestParam is used when data is in the form of key value pairs.
//    public RedirectView deleteById(@RequestParam("id") String id, HttpServletRequest req) {
//
//        userService.deleteById(Integer.parseInt(id));
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl(req.getContextPath()+"/getAllUsers");
//        return redirectView;
//    }

    @RequestMapping("delete/{id}")
    public RedirectView deleteById(@PathVariable("id") String id, HttpServletRequest request) {

        userService.deleteById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/getAllUsers");
        return redirectView;
    }

    @RequestMapping("fetchUser")
    public String fetchUserById(@RequestParam("userId") String id, Model model) {
        UserDto userDto = userService.getUserById(Integer.parseInt(id));
        System.out.println("edited id :" + userDto);
        model.addAttribute("user", userDto);
        return "updateUser.jsp";
    }

    @RequestMapping("updateUser")
    public String updateById(UserDto userDto, Model model) {
        boolean updateUser = userService.updateUser(userDto);
        if (updateUser)
            model.addAttribute("msg", "User Data Updated Successfully...!");
        else
            model.addAttribute("msg", "Updating of User Data Failed...!");

        return "updateResponse.jsp";
    }
}

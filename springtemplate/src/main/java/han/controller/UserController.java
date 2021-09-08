package han.controller;

import han.pojo.User;
import han.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findAllUsersCon() {
        List<User> userList = userService.findAllUsersService();
        return userList;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findUserByIdCon(@PathVariable("id") Integer id) {
        return userService.findUserByIdService(id);
    }
}

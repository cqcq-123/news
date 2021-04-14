package cn.easybuy.control;

import cn.easybuy.pojo.Provider;
import cn.easybuy.pojo.User;
import cn.easybuy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/userControl")
@Controller
public class UserControl {
    @Resource
    private UserService userService;

    //用户名是否相等
    @RequestMapping("/toLogin")
    public String toLogin(Model model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        List<User> list = userService.selectServiceUserName();
        boolean flag = false;
        for (User users : list) {
            if (users.getUserName().equals(userName) && users.getUserPassword().equals(userPassword)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return "redirect:index";
        } else {
            return "login";
        }
    }

    //用户名是否存在
    @RequestMapping("/toNameLogin")
    @ResponseBody   //不需要跳转到任何页面，直接把返回值给ajax
    public Object toNameLogin(Model model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        List<User> list = userService.selectServiceUserName();
        System.out.printf(userName);
        String flag = "true";
        for (User users : list) {
            if (userName.equals(users.getUserName()) || userName == "") {
                flag = "false";
            }
        }
            return flag;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    //展示页面
    @RequestMapping("/tableUser")
    public String tableUser(Model model) {
        List<User> list = userService.getServiceUser();
        model.addAttribute("list", list);
        return "tableUser";
    }

    //添加用户页面
    @RequestMapping("/userForm")
    public String userForm() {
        return "userForm";
    }

    //用户添加操作
    @RequestMapping("/toUserForm")
    public String toUserForm(Model model, HttpServletRequest request) {
        String userCode = request.getParameter("userCode");
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String bir = request.getParameter("birthday");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Integer userRole = Integer.parseInt(request.getParameter("userRole"));
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        String date = request.getParameter("creationDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date creationDate = sdf.parse(date);
            Date birthday = sdf.parse(bir);
            User user = new User();
            user.setAddress(address);
            user.setBirthday(birthday);
            user.setCreatedBy(createdBy);
            user.setCreationDate(creationDate);
            user.setGender(gender);
            user.setPhone(phone);
            user.setUserCode(userCode);
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserRole(userRole);
            boolean list = userService.addServiceUser(user);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "index";
    }

    //用户删除操作
    @RequestMapping("/deleteUser")
    public String deleteUser(Model model, HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        boolean list = userService.deleteServiceUser(id);
        return "index";
    }

    //用户修改页面
    @RequestMapping("/userUpdateForm")
    public String userUpdateForm(Model model, HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        List<User> list = userService.selectServiceUserID(id);
        model.addAttribute("list", list);
        return "userUpdateForm";
    }

    @RequestMapping("/userID")
    public String userID(Model model, HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String userCode = request.getParameter("userCode");
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String bir = request.getParameter("birthday");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Integer userRole = Integer.parseInt(request.getParameter("userRole"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = sdf.parse(bir);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        User user = new User();
        user.setAddress(address);
        user.setBirthday(birthday);
        user.setCreatedBy(createdBy);
        user.setCreationDate(new Date());
        user.setGender(gender);
        user.setPhone(phone);
        user.setUserCode(userCode);
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserRole(userRole);
        user.setCreatedBy(createdBy);
        user.setId(id);
        user.setCreationDate(new Date());
        boolean list = userService.updateServiceUser(user);
        return "index";
    }
}

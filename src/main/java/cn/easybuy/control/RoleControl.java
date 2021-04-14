package cn.easybuy.control;

import cn.easybuy.pojo.Role;
import cn.easybuy.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/roleControl")// 要加斜杠-->/
@Controller
public class RoleControl {
    @Resource
    private RoleService roleService;
    //订单展示页面
    @RequestMapping("/tableRole")
    public String tableRole(Model model){
        List<Role> list =roleService.getServiceRole();
        model.addAttribute("list",list);
        return "tableRole";
    }
    @RequestMapping("/roleForm")
    public String roleForm(){
        return "roleForm";
    }
    @RequestMapping("/toRoleForm")
    public String toRoleForm(Model model,HttpServletRequest request){
        String roleCode = request.getParameter("roleCode");
        String roleName = request.getParameter("roleName");
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        String date = request.getParameter("creationDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date creationDate = sdf.parse(date);
            Role role = new Role();
            role.setRoleCode(roleCode);
            role.setRoleName(roleName);
            role.setCreatedBy(createdBy);
            role.setCreationDate(creationDate);
            boolean list = roleService.addServiceRole(role);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/deleteRole")
    public String deleteRole(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        boolean list = roleService.deleteServiceRole(id);
        return "index";
    }

    @RequestMapping("/roleUpdateForm")
    public String RoleUpdateForm(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        List<Role> list = roleService.selectServiceRoleID(id);
        model.addAttribute("list",list);
        return "roleUpdateForm";
    }
    @RequestMapping("/roleID")
    public String RoleID(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String roleCode = request.getParameter("roleCode");
        String roleName = request.getParameter("roleName");
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        Role role = new Role();
        role.setRoleCode(roleCode);
        role.setRoleName(roleName);
        role.setId(id);
        role.setCreatedBy(createdBy);
        role.setCreationDate(new Date());
        boolean list = roleService.updateServiceRole(role);
        return "index";
    }
}

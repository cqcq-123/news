package cn.easybuy.control;

import cn.easybuy.pojo.Account;
import cn.easybuy.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/accountControl")// 要加斜杠-->/
@Controller
public class AccountControl {
    @Resource
    private AccountService accountService;
    //订单展示页面
    @RequestMapping("/tableAccount")
    public String tableAccount(Model model){
        List<Account> list =accountService.getServiceAccount();
        model.addAttribute("list",list);
        return "tableAccount";
    }
    @RequestMapping("/accountForm")
    public String AccountForm(){
        return "accountForm";
    }
    @RequestMapping("/toAccountForm")
    public String toAccountForm(Model model,HttpServletRequest request){
        String devCode = request.getParameter("devCode");
        String devName = request.getParameter("devName");
        String devPassword = request.getParameter("devPassword");
        String devEmail = request.getParameter("devEmail");
        String devInfo = request.getParameter("devInfo");
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        String date = request.getParameter("creationDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date creationDate = sdf.parse(date);
            Account account = new Account();
            account.setDevCode(devCode);
            account.setDevEmail(devEmail);
            account.setDevName(devName);
            account.setDevInfo(devInfo);
            account.setCreatedBy(createdBy);
            account.setDevPassword(devPassword);
            account.setCreationDate(creationDate);
            boolean list = accountService.addServiceAccount(account);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/deleteAccount")
    public String deleteAccount(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        boolean list = accountService.deleteServiceAccount(id);
        return "index";
    }

    @RequestMapping("/accountUpdateForm")
    public String accountUpdateForm(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        List<Account> list = accountService.selectServiceAccountID(id);
        model.addAttribute("list",list);
        return "accountUpdateForm";
    }
    @RequestMapping("/accountID")
    public String accountID(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String devCode = request.getParameter("devCode");
        String devName = request.getParameter("devName");
        String devPassword = request.getParameter("devPassword");
        String devEmail = request.getParameter("devEmail");
        String devInfo = request.getParameter("devInfo");
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        Account account = new Account();
        account.setId(id);
        account.setDevCode(devCode);
        account.setDevEmail(devEmail);
        account.setDevName(devName);
        account.setDevInfo(devInfo);
        account.setCreatedBy(createdBy);
        account.setDevPassword(devPassword);
        account.setCreatedBy(createdBy);
        account.setCreationDate(new Date());
        boolean list = accountService.updateServiceAccount(account);
        return "index";
    }
}

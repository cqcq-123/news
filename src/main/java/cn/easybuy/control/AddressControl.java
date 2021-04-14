package cn.easybuy.control;

import cn.easybuy.pojo.Address;
import cn.easybuy.pojo.Bill;
import cn.easybuy.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/addressControl")// 要加斜杠-->/
@Controller
public class AddressControl {
    @Resource
    private AddressService addressService;
    //订单展示页面
    @RequestMapping("/tableAddress")
    public String tableAddress(Model model){
        List<Address> list =addressService.getServiceAddress();
        model.addAttribute("list",list);
        return "tableAddress";
    }
    @RequestMapping("/addressForm")
    public String addressForm(){
        return "addressForm";
    }
    @RequestMapping("/toaddressForm")
    public String toaddressForm(Model model,HttpServletRequest request){
        String contact = request.getParameter("contact");
        String addressDesc = request.getParameter("addressDesc");
        String postCode = request.getParameter("postCode");
        String tel = request.getParameter("tel");
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        String date = request.getParameter("creationDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date creationDate = sdf.parse(date);
            Address address = new Address();
            address.setContact(contact);
            address.setAddressDesc(addressDesc);
            address.setPostCode(postCode);
            address.setTel(tel);
            address.setCreatedBy(createdBy);
            address.setCreationDate(creationDate);
            boolean list = addressService.addServiceAddress(address);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/deleteAddress")
    public String deleteAddress(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        boolean list = addressService.deleteServiceAddress(id);
        return "index";
    }

    @RequestMapping("/addressUpdateForm")
    public String addressUpdateForm(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        List<Address> list = addressService.selectServiceAddressID(id);
        System.out.printf("***********"+id+list);
        model.addAttribute("list",list);
        return "addressUpdateForm";
    }
    @RequestMapping("/addressID")
    public String AddressID(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String contact = request.getParameter("contact");
        String addressDesc = request.getParameter("addressDesc");
        String postCode = request.getParameter("postCode");
        String tel = request.getParameter("tel");
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        Address  address= new Address();
        address.setId(id);
        address.setContact(contact);
        address.setPostCode(postCode);
        address.setTel(tel);
        address.setAddressDesc(addressDesc);
        address.setCreatedBy(createdBy);
        address.setCreationDate(new Date());
        boolean list = addressService.updateServiceAddress(address);
        return "index";
    }
}

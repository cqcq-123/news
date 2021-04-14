package cn.easybuy.control;

import cn.easybuy.pojo.Bill;
import cn.easybuy.pojo.Provider;
import cn.easybuy.service.BillService;
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

@RequestMapping("/billControl")// 要加斜杠-->/
@Controller
public class BillControl {
    @Resource
    private BillService billService;
    //订单展示页面
    @RequestMapping("/tableBill")
    public String tableBill(Model model){
        List<Bill> list = billService.getServiceBill();
        model.addAttribute("list",list);
        return "tableBill";
    }
    @RequestMapping("/billForm")
    public String billForm(){
        return "billForm";
    }

    @RequestMapping("/tobillForm")
    public String tobillForm(Model model,HttpServletRequest request){
        String billCode = request.getParameter("billCode");
        String productName = request.getParameter("productName");
        String productDesc = request.getParameter("productDesc");
        String productUnit = request.getParameter("productUnit");
        BigDecimal productCount = BigDecimal.valueOf( new Double(request.getParameter("productCount")));
        BigDecimal totalPrice = BigDecimal.valueOf( new Double(request.getParameter("totalPrice")));
        Integer isPayment = Integer.parseInt(request.getParameter("isPayment"));
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        String date = request.getParameter("creationDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date creationDate = sdf.parse(date);
            Bill bill = new Bill();
            bill.setBillCode(billCode);
            bill.setProductName(productName);
            bill.setProductDesc(productDesc);
            bill.setProductUnit(productUnit);
            bill.setProductCount(productCount);
            bill.setTotalPrice(totalPrice);
            bill.setIsPayment(isPayment);
            bill.setCreatedBy(createdBy);
            bill.setCreationDate(creationDate);
            boolean list = billService.addServiceBill(bill);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "index";
    }
    @RequestMapping("/deleteBill")
    public String deleteProvider(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        boolean list = billService.deleteServiceBill(id);
        return "index";
    }
    @RequestMapping("/billUpdateForm")
    public String billUpdateForm(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        List<Bill> list = billService.selectServiceBillID(id);
        model.addAttribute("list",list);
        return "billUpdateForm";
    }
    @RequestMapping("/billID")
    public String billID(Model model,HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String billCode = request.getParameter("billCode");
        String productName = request.getParameter("productName");
        String productDesc = request.getParameter("productDesc");
        String productUnit = request.getParameter("productUnit");
        BigDecimal productCount = BigDecimal.valueOf( new Double(request.getParameter("productCount")));
        BigDecimal totalPrice = BigDecimal.valueOf( new Double(request.getParameter("totalPrice")));
        Integer isPayment = Integer.parseInt(request.getParameter("isPayment"));
        Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
        Bill bill = new Bill();
        bill.setId(id);
        bill.setBillCode(billCode);
        bill.setProductName(productName);
        bill.setProductDesc(productDesc);
        bill.setProductUnit(productUnit);
        bill.setProductCount(productCount);
        bill.setTotalPrice(totalPrice);
        bill.setIsPayment(isPayment);
        bill.setCreatedBy(createdBy);
        bill.setCreationDate(new Date());
        System.out.print("**************************SgetBillCode"+bill.getBillCode()+
                "getTotalPrice"+bill.getTotalPrice()+"getCreationDate"+bill.getCreationDate());
        boolean list = billService.updateServiceBill(bill);
        return "index";
    }
}

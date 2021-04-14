package cn.easybuy.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.easybuy.pojo.Provider;
import cn.easybuy.service.ProviderService;

/**
 * @author Administrator
 * @parameter Product控制类
 */
@RequestMapping("/providerControl")// 要加斜杠-->/
@Controller
public class ProviderControl {
	@Resource
	private ProviderService providerService;
	//展示页面
	@RequestMapping("/table")
	public String table(Model model){
		List<Provider> list = providerService.getServiceProvider();
		model.addAttribute("list",list);
		return "table";
	}
	//错误页面
	@RequestMapping("/error")
	public String error(){
		return "error";
	}
	//登录页面
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	//主页面
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	//添加页面
	@RequestMapping("/form")
	public String form(){
		return "form";
	}
	//添加供应商页面
	@RequestMapping("/providerForm")
	public String providerForm(){
		return "providerForm";
	}
	//供应商添加操作
	@RequestMapping("/toProviderForm")
	public String toProviderForm(Model model,HttpServletRequest request){
		String proCode = request.getParameter("proCode");
		String proName = request.getParameter("proName");
		String proDesc = request.getParameter("proDesc");
		String proContact = request.getParameter("proContact");
		String proPhone = request.getParameter("proPhone");
		String proAddress = request.getParameter("proAddress");
		String proFax = request.getParameter("proFax");
		Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
		String date = request.getParameter("creationDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date creationDate = sdf.parse(date);
			Provider provider = new Provider();
			provider.setProName(proName);
			provider.setProCode(proCode);
			provider.setProDesc(proDesc);
			provider.setProContact(proContact);
			provider.setProPhone(proPhone);
			provider.setProAddress(proAddress);
			provider.setProFax(proFax);
			provider.setCreatedBy(createdBy);
			provider.setCreationDate(creationDate);
			boolean list = providerService.addServiceProvider(provider);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "index";
	}
	//供应商删除操作
	@RequestMapping("/deleteProvider")
	public String deleteProvider(Model model,HttpServletRequest request){
		Integer id = Integer.parseInt(request.getParameter("id"));
		boolean list = providerService.deleteServiceProvider(id);
		return "index";
	}
	//供应商修改页面
	@RequestMapping("/providerUpdateForm")
	public String providerUpdateForm(Model model,HttpServletRequest request){
		Integer id = Integer.parseInt(request.getParameter("id"));
		List<Provider> list = providerService.selectServiceProviderID(id);
		model.addAttribute("list",list);
		return "providerUpdateForm";
	}

	@RequestMapping("/providerID")
	public String providerID(Model model,HttpServletRequest request){
		Integer id = Integer.parseInt(request.getParameter("id"));
		String proCode = request.getParameter("proCode");
		String proName = request.getParameter("proName");
		String proDesc = request.getParameter("proDesc");
		String proContact = request.getParameter("proContact");
		String proPhone = request.getParameter("proPhone");
		String proAddress = request.getParameter("proAddress");
		String proFax = request.getParameter("proFax");
		Integer createdBy = Integer.parseInt(request.getParameter("createdBy"));
		Provider provider = new Provider();
		provider.setId(id);
		provider.setProName(proName);
		provider.setProCode(proCode);
		provider.setProDesc(proDesc);
		provider.setProContact(proContact);
		provider.setProPhone(proPhone);
		provider.setProAddress(proAddress);
		provider.setProFax(proFax);
		provider.setCreatedBy(createdBy);
		System.out.print("*********》"+id+proName);
		provider.setCreationDate(new Date());
		boolean list = providerService.updateServiceProvider(provider);
		return "index";
	}
}

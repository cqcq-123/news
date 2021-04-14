package cn.easybuy.service;

import cn.easybuy.pojo.Bill;
import cn.easybuy.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BillService {
	// 查询
	public List<Bill> getServiceBill();
	//添加
	public boolean addServiceBill(Bill bill);
	//删除
	public boolean deleteServiceBill(@Param("id") Integer id);
	//查询ID
	public List<Bill> selectServiceBillID(@Param("id") Integer id);
	//修改
	public boolean updateServiceBill(Bill bill);
}

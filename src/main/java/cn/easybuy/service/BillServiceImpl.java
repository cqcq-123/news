package cn.easybuy.service;

import cn.easybuy.dao.BillMapper;
import cn.easybuy.dao.ProviderMapper;
import cn.easybuy.pojo.Bill;
import cn.easybuy.pojo.Provider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("billService")
public class BillServiceImpl implements BillService {
	@Resource
	private BillMapper billMapper;

	public List<Bill> getServiceBill() {
		return billMapper.selectBill();
	}
	public boolean addServiceBill(Bill bill){
		return  billMapper.addBill(bill);
	}
	public boolean deleteServiceBill(Integer id){
		return billMapper.deleteBill(id);
	}
	public List<Bill> selectServiceBillID(Integer id) {
		return billMapper.selectBillID(id);
	}
	public boolean updateServiceBill(Bill bill){
		return billMapper.updateBill(bill);
	}
}

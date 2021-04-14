package cn.easybuy.dao;

import cn.easybuy.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    // 查询
    public List<Bill> selectBill();

    //添加
    public boolean addBill(Bill bill);
    //删除
    public boolean deleteBill(@Param("id") Integer id);
    //查询ID
    public List<Bill> selectBillID(@Param("id") Integer id);
    //修改
    public boolean updateBill(Bill bill);
}

package cn.easybuy.dao;

import cn.easybuy.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    // 查询
    public List<Address> selectAddress();
    //添加
    public boolean addAddress(Address address);
    //删除
    public boolean deleteAddress(@Param("id") Integer id);
    //查询ID
    public List<Address> selectAddressID(@Param("id") Integer id);
    //修改
    public boolean updateAddress(Address address);
}

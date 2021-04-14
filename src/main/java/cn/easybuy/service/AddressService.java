package cn.easybuy.service;

import cn.easybuy.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressService {
    // 查询
    public List<Address> getServiceAddress();
    //添加
    public boolean addServiceAddress(Address address);
    //删除
    public boolean deleteServiceAddress(@Param("id") Integer id);
    //查询ID
    public List<Address> selectServiceAddressID(@Param("id") Integer id);
    //修改
    public boolean updateServiceAddress(Address address);
}

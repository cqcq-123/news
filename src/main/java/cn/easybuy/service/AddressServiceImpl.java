package cn.easybuy.service;

import cn.easybuy.dao.AddressMapper;
import cn.easybuy.pojo.Address;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("addressService")
public class AddressServiceImpl  implements  AddressService{
    @Resource
    private AddressMapper addressMapper;
    @Override
    public List<Address> getServiceAddress() {
        return addressMapper.selectAddress();
    }


    @Override
    public boolean addServiceAddress(Address address) {
        return addressMapper.addAddress(address);
    }


    @Override
    public boolean deleteServiceAddress(Integer id) {
        return addressMapper.deleteAddress(id);
    }


    @Override
    public List<Address> selectServiceAddressID(Integer id) {
        return addressMapper.selectAddressID(id);
    }

    @Override
    public boolean updateServiceAddress(Address address) {
        return addressMapper.updateAddress(address);
    }
}

package cn.easybuy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.easybuy.dao.ProviderMapper;
import cn.easybuy.pojo.Provider;

@Service("productService")
public class ProductServiceImpl implements ProviderService {
	@Resource
	private ProviderMapper providerMapper;

	public List<Provider> getServiceProvider() {
		return providerMapper.selectProvider();
	}
	public boolean addServiceProvider(Provider provider){
		return  providerMapper.addProvider(provider);
	}
	public boolean deleteServiceProvider(Integer id){
		return  providerMapper.deleteProvider(id);
	}
	public List<Provider> selectServiceProviderID(Integer id) {
		return providerMapper.selectProviderID(id);
	}
	public boolean updateServiceProvider(Provider provider){
		return providerMapper.updateProvider(provider);
	}
}

package cn.easybuy.service;

import java.util.List;

import cn.easybuy.pojo.Provider;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @parameter 商品service接口
 */
public interface ProviderService {
	// 查询
	public List<Provider> getServiceProvider();
	//添加
	public boolean addServiceProvider(Provider provider);
	//删除
	public boolean deleteServiceProvider(@Param("id") Integer id);
	//查询ID
	public List<Provider> selectServiceProviderID(@Param("id") Integer id);
	//修改
	public boolean updateServiceProvider(Provider provider);
}

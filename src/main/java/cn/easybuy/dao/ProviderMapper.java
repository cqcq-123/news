package cn.easybuy.dao;

import java.util.List;
import cn.easybuy.pojo.Provider;
import org.apache.ibatis.annotations.Param;

public interface ProviderMapper {
	// 查询
	public List<Provider> selectProvider();
	//添加
	public boolean addProvider(Provider provider);
	//删除
	public boolean deleteProvider(@Param("id") Integer id);
	//查询ID
	public List<Provider> selectProviderID(@Param("id") Integer id);
	//修改
	public boolean updateProvider(Provider provider);
}

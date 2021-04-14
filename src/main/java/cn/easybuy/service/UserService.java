package cn.easybuy.service;

import java.util.List;


import cn.easybuy.pojo.User;
import cn.easybuy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
	// 登录查询用户姓名
	public List<User> selectServiceUserName();
	// 查询
	public List<User> getServiceUser();
	//添加
	public boolean addServiceUser(User user);
	//删除
	public boolean deleteServiceUser(@Param("id") Integer id);
	//查询ID
	public List<User> selectServiceUserID(@Param("id") Integer id);
	//修改
	public boolean updateServiceUser(User user);
}

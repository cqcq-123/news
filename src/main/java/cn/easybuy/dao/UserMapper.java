package cn.easybuy.dao;

import java.util.List;


import cn.easybuy.pojo.User;
import cn.easybuy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	//登录查询用户姓名
	public List<User> selectUserName();
	//查询用户信息
	public List<User> selectUser();
	//添加
	public boolean addUser(User user);
	//删除
	public boolean deleteUser(@Param("id") Integer id);
	//查询ID
	public List<User> selectUserID(@Param("id") Integer id);
	//修改
	public boolean updateUser(User user);
}

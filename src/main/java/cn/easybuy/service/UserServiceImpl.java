package cn.easybuy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.easybuy.dao.UserMapper;
import cn.easybuy.pojo.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> getServiceUser() {
		return userMapper.selectUser();
	}

	@Override
	public boolean addServiceUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public boolean deleteServiceUser(Integer id) {
		return userMapper.deleteUser(id);
	}

	@Override
	public List<User> selectServiceUserID(Integer id) {
		return userMapper.selectUserID(id);
	}

	@Override
	public boolean updateServiceUser(User user) {
		return userMapper.updateUser(user);
	}

	public List<User> selectServiceUserName() {
		return userMapper.selectUserName();
	}

}

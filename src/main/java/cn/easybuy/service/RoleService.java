package cn.easybuy.service;

import cn.easybuy.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {
    // 查询
    public List<Role> getServiceRole();
    //添加
    public boolean addServiceRole(Role role);
    //删除
    public boolean deleteServiceRole(@Param("id") Integer id);
    //查询ID
    public List<Role> selectServiceRoleID(@Param("id") Integer id);
    //修改
    public boolean updateServiceRole(Role role);
}

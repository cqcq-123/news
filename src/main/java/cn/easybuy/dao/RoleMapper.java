package cn.easybuy.dao;

import cn.easybuy.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    // 查询
    public List<Role> selectRole();
    //添加
    public boolean addRole(Role role);
    //删除
    public boolean deleteRole(@Param("id") Integer id);
    //查询ID
    public List<Role> selectRoleID(@Param("id") Integer id);
    //修改
    public boolean updateRole(Role role);
}

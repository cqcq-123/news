package cn.easybuy.service;

import cn.easybuy.dao.RoleMapper;
import cn.easybuy.dao.RoleMapper;
import cn.easybuy.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
    @Resource
    private RoleMapper roleMapper;
    @Override
    public List<Role> getServiceRole() {
        return  roleMapper.selectRole();
    }


    @Override
    public boolean addServiceRole(Role role) {
        return  roleMapper.addRole(role);
    }


    @Override
    public boolean deleteServiceRole(Integer id) {
        return  roleMapper.deleteRole(id);
    }


    @Override
    public List<Role> selectServiceRoleID(Integer id) {
        return roleMapper.selectRoleID(id);
    }

    @Override
    public boolean updateServiceRole(Role role) {
        return roleMapper.updateRole(role);
    }
}

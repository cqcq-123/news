package cn.easybuy.service;

import cn.easybuy.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {
    // 查询
    public List<Account> getServiceAccount();
    //添加
    public boolean addServiceAccount(Account account);
    //删除
    public boolean deleteServiceAccount(@Param("id") Integer id);
    //查询ID
    public List<Account> selectServiceAccountID(@Param("id") Integer id);
    //修改
    public boolean updateServiceAccount(Account account);
}

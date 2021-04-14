package cn.easybuy.dao;

import cn.easybuy.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    // 查询
    public List<Account> selectAccount();
    //添加
    public boolean addAccount(Account account);
    //删除
    public boolean deleteAccount(@Param("id") Integer id);
    //查询ID
    public List<Account> selectAccountID(@Param("id") Integer id);
    //修改
    public boolean updateAccount(Account account);
}

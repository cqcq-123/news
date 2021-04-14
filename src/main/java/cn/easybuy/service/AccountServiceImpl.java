package cn.easybuy.service;

import cn.easybuy.dao.AccountMapper;
import cn.easybuy.pojo.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Resource
    private AccountMapper accountMapper;
    @Override
    public List<Account> getServiceAccount() {
        return  accountMapper.selectAccount();
    }


    @Override
    public boolean addServiceAccount(Account account) {
        return  accountMapper.addAccount(account);
    }


    @Override
    public boolean deleteServiceAccount(Integer id) {
        return  accountMapper.deleteAccount(id);
    }


    @Override
    public List<Account> selectServiceAccountID(Integer id) {
        return accountMapper.selectAccountID(id);
    }

    @Override
    public boolean updateServiceAccount(Account account) {
        return accountMapper.updateAccount(account);
    }
}

package org.com.service;

import org.com.dao.IUserBankDao;
import org.com.dao.impl.UserBankDao;
import org.com.entitys.UserBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service("ubs")
public class UserBankService {
    @Autowired
    @Qualifier("ubd")
    private IUserBankDao ubd;

    public  void setUbd(IUserBankDao ubd) {
        this.ubd = ubd;
    }

    public int AddUserBank(UserBank ub){
        return ubd.AddUserBank(ub);
    }

    public List<UserBank> QueryAll(){
        return ubd.QueryAll();
    }

}

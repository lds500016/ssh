package org.com.dao;

import org.com.entitys.UserBank;

import java.util.List;

public interface IUserBankDao {

    public int AddUserBank(UserBank ub);

    public List<UserBank> QueryAll();
}

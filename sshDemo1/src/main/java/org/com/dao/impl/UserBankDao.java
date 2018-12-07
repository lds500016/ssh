package org.com.dao.impl;

import org.com.dao.IUserBankDao;
import org.com.entitys.UserBank;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ubd")
public class UserBankDao extends HibernateDaoSupport implements IUserBankDao {
    @Override
    public int AddUserBank(UserBank ub) {

         this.getHibernateTemplate().save(ub);

         return 1;
    }

    @Override
    public List<UserBank> QueryAll() {
        Session session=this.getSessionFactory().openSession();
        String hql="from UserBank order by userId desc";
        Query query=session.createQuery(hql);
        return  query.list();
    }
}

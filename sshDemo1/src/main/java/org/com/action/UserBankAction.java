package org.com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.com.entitys.UserBank;
import org.com.service.UserBankService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("userBankAction")
public class UserBankAction extends ActionSupport {

    private UserBank ub;

    public void setUb(UserBank ub) {
        this.ub = ub;
    }

    public UserBank getUb() {
        return ub;
    }

    @Resource(name = "ubs")
    private UserBankService ubs;

    public void setUbs(UserBankService ubs) {
        this.ubs = ubs;
    }

    private List<UserBank> ubList;

    public void setUbList(List<UserBank> ubList) {
        this.ubList = ubList;
    }

    public List<UserBank> getUbList() {
        return ubList;
    }

    private String successUrl="/index.jsp";

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public String addBankIndex(){
        this.successUrl="/addBank.jsp";
        return SUCCESS;
    }
    public String addBank(){
        ubs.AddUserBank(ub);
        successUrl="/addBank.jsp";
        return SUCCESS;
    }

    public String Index(){
        ubList=ubs.QueryAll();
        successUrl="/index.jsp";
        return SUCCESS;
    }

}

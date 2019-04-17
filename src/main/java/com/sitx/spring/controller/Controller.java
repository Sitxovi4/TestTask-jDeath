package com.sitx.spring.controller;


import com.sitx.spring.Service;
import com.sitx.spring.dao.DAOImpl.AccountDAOImpl;
import com.sitx.spring.dao.DAOImpl.UserDAOImpl;
import com.sitx.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {


    private UserDAOImpl userDAOImpl;
    private AccountDAOImpl accountDAOImpl;
    private Service service;

    @Autowired
    public Controller(UserDAOImpl userDAOImpl, AccountDAOImpl accountDAOImpl, Service service) {
        this.userDAOImpl = userDAOImpl;
        this.accountDAOImpl = accountDAOImpl;
        this.service = service;
    }


    @GetMapping(value = "/getAccountSum" )
    public String getAccountSum(Model model){
        int accountSum = accountDAOImpl.getAccountsSum();
        model.addAttribute("accountsum", accountSum);
        return "accountssum";

    }

    @GetMapping(value = "/getRichestUser" )
    public String getRichestUser(Model model){
        User user = (User) service.getRichestUser();
        String richest = user.getNAME()+ " " +user.getSURNAME();
        model.addAttribute("richest", richest);
        return "richestuser";

    }
}

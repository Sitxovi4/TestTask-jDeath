package com.sitx.spring.controller;

import com.sitx.spring.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    private final UserDAO userDAO;

    @Autowired
    public Controller(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @RequestMapping(value = "/getAccountSum", method = RequestMethod.GET)
    public ModelAndView getAccountSum(ModelAndView modelAndView){
        int accountSum = userDAO.getAccountsSum();
        modelAndView.addObject("accountsum",accountSum);
        modelAndView.setViewName("accountssum");
        return modelAndView;

    }


    @RequestMapping(value = "/getRichestUser", method = RequestMethod.GET)
    public ModelAndView getRichestUser(ModelAndView modelAndView){
        String richest = userDAO.getRichestUser().getNAME()+ " " + userDAO.getRichestUser().getSURNAME();
        modelAndView.addObject("richest", richest);
        modelAndView.setViewName("richestuser");
        return modelAndView;

    }
}

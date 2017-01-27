package com.epam.task3.controller;

import com.epam.task3.bean.SportEquipment;
import com.epam.task3.service.ShopService;
import com.epam.task3.service.exception.ServiceException;
import com.epam.task3.service.service.factory.ServiceFactory;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class ShowInShopList implements Command {

        public String execute (String request){
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ShopService shopService = serviceFactory.getShopService();
        try {
            shopService.isInShopList();
            request = "In the shop";
        } catch (ServiceException e){
            request = "Error";
        }
        return request;
    }
}

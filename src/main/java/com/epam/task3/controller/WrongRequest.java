package com.epam.task3.controller;

import com.epam.task3.bean.SportEquipment;
import com.epam.task3.service.ShopService;
import com.epam.task3.service.exception.ServiceException;
import com.epam.task3.service.service.factory.ServiceFactory;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class WrongRequest {

    public String execute(String request){

        request = "We don't have such equipment =(";
        return request;
    }
}

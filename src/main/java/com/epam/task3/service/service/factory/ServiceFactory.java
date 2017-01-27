package com.epam.task3.service.service.factory;

import com.epam.task3.service.ShopService;
import com.epam.task3.service.service.impl.ShopServiceImpl;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();
    private final ShopService shopService = new ShopServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }
    public ShopService getShopService(){
        return shopService;
    }
}

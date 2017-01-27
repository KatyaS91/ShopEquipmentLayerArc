package com.epam.task3.dao.dao.factory;

import com.epam.task3.dao.ShopDAO;
import com.epam.task3.dao.dao.impl.SQLShopDAO;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final ShopDAO sqlShopImpl = new SQLShopDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }
    public ShopDAO getShopDAO (){
        return sqlShopImpl;
    }

}

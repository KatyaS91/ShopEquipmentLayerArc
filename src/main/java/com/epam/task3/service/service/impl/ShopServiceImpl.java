package com.epam.task3.service.service.impl;

import com.epam.task3.bean.SportEquipment;
import com.epam.task3.dao.ShopDAO;
import com.epam.task3.dao.dao.factory.DAOFactory;
import com.epam.task3.service.ShopService;
import com.epam.task3.service.exception.ServiceException;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class ShopServiceImpl implements ShopService {

    public void isInShop(SportEquipment sportEquipment) throws ServiceException {
        // метод поиска в магазин
    }

    public void deleteFromShop(SportEquipment sportEquipment) throws ServiceException{

        DAOFactory daoFactory = DAOFactory.getInstance();
        ShopDAO shopDAO = daoFactory.getShopDAO();
        //shopDAO.deleteFromShop(sportEquipment);

    }

    public void isInRentList() throws ServiceException{

    }

    public void isInShopList() throws ServiceException{

    }

    public void putInRentUnits(SportEquipment sportEquipment) throws ServiceException{

    }
}




/*
    void isInShop(SportEquipment sportEquipment);
    void deleteFromShop(SportEquipment sportEquipment);
    void putInRentUnits(SportEquipment sportEquipment);
    void isInShopList(SportEquipment sportEquipment);
    void isInRentList(SportEquipment sportEquipment);*/

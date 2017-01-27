package com.epam.task3.service;

import com.epam.task3.bean.SportEquipment;
import com.epam.task3.service.exception.ServiceException;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public interface ShopService {

    void isInShop(SportEquipment sportEquipment) throws ServiceException;
    void deleteFromShop(SportEquipment sportEquipment) throws ServiceException;
    void putInRentUnits(SportEquipment sportEquipment) throws ServiceException;
    void isInShopList() throws ServiceException;
    void isInRentList() throws ServiceException;

}

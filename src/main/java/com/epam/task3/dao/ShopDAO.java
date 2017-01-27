package com.epam.task3.dao;

import com.epam.task3.bean.SportEquipment;
import com.epam.task3.dao.exeption.DAOException;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public interface ShopDAO {

    void findGood (SportEquipment sportEquipment) throws DAOException;
    void putGoodInRent (SportEquipment sportEquipment) throws DAOException;
    void deleteFromShop(SportEquipment sportEquipment) throws DAOException;


}

package com.epam.task3.dao.dao.impl;

import com.epam.task3.bean.SportEquipment;
import com.epam.task3.dao.ShopDAO;
import com.epam.task3.dao.exeption.DAOException;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class SQLShopDAO implements ShopDAO {


    public void findGood(SportEquipment sportEquipment) throws DAOException {
        // связываемся с базой и берем такой товар
    }

    public void putGoodInRent(SportEquipment sportEquipment) throws DAOException {
        // добавляем взятый товар в список арендованых
    }

    public void deleteFromShop(SportEquipment sportEquipment) throws DAOException {
        // удалить из шопа
    }
}

package com.epam.task3.view;

import com.epam.task3.bean.Customer;
import com.epam.task3.bean.SportEquipment;
import com.epam.task3.controller.Controller;
import com.epam.task3.controller.TakeGood;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class Starter {
    public static void main(String[] args){

        Controller controller = new Controller();

        Customer customer = new Customer("Snowboard");

        controller.setSportEquipment(new SportEquipment(customer.getGood()));
        controller.executeTask("TakeGoog");
        controller.executeTask("ShowRentUnitList");
        controller.executeTask("ShowInShopList");

    }
}

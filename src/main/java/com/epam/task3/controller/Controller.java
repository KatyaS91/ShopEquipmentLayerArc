package com.epam.task3.controller;

import com.epam.task3.bean.Customer;
import com.epam.task3.bean.SportEquipment;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    private SportEquipment sportEquipment;

    public void setSportEquipment(SportEquipment sportEquipment) {
        this.sportEquipment = sportEquipment;
    }

    public SportEquipment getSportEquipment() {
        return sportEquipment;
    }


    private final char paramDelimeter = '_';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;

        commandName = request.substring(0,request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);
        return response;
    }

}

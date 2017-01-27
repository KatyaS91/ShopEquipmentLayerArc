package com.epam.task3.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
final class CommandProvider {

    private final Map<CommandName, Command> repository = new HashMap();

    CommandProvider(){
        repository.put(CommandName.TAKE_GOOD, new TakeGood());
        repository.put(CommandName.SHOW_RENT_UNIT_LIST, new ShowRentUnitList());
        repository.put(CommandName.SHOW_IN_SHOP_LIST, new ShowInShopList());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }
    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch(IllegalArgumentException e){
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }

}

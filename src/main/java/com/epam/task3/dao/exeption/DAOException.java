package com.epam.task3.dao.exeption;


/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class DAOException extends Exception {
    private static final long serialVersionUIP = 1L;

    public DAOException(){
        super();
    }
    public DAOException(String message){
        super(message);
    }
    public DAOException(Exception e){
        super(e);
    }
    public DAOException(String message, Exception e){
        super(message, e);
    }
}

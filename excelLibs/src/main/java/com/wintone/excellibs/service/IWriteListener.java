package com.wintone.excellibs.service;

public interface IWriteListener {

    void onStartWrite();

    /**
     * @param e 异常
     */
    void onWriteError(Exception e);


    void onEndWrite();

}

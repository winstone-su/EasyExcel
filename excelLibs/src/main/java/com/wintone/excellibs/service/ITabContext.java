package com.wintone.excellibs.service;

import java.util.Map;

public interface ITabContext {

        String getSheetName();

        int getSheetIndex();

        Map<Integer,String> getExcelProperty();

}

/**************************************************************
 * Copyright (C) 2011 Marks And Spencer, All Rights Reserved
 *****
 * Description
 * This class is a helper class that handle with all loyalty service related stuff.
 *****
 * Name: com.mns.commerce.order.helper.MSLoyaltyServiceHelper.java
 * @author mshaki
 * Date: Mar 19, 2015
 **************************************************************/
package com.mns.commerce.catalog.helper;

import java.util.Date;

/**
 * This class is a helper class that handle with all assembly service helper methods.
 * @author skalra
 */

public final class MSAssemblyServiceHelper {

    /**
     * Class name.
     */
    private static final String CLASSNAME = MSAssemblyServiceHelper.class.getName();
    /**
     * Serial Version Id.
     */
    private static final long serialVersionUID = 3600338974355377981L;
    /**
     * Singleton instance.
     */
    private static MSAssemblyServiceHelper instance = new MSAssemblyServiceHelper();

    /**
     * private default constructor.
     */
    private MSAssemblyServiceHelper() {

    }

    /**
     * This method returns the singleton instance for this class.
     * @return instance MSAssemblyServiceHelper.
     */
    public static MSAssemblyServiceHelper getInstance() {
        return instance;
    }

    /**
     * Method to generate request token that will be passed while calling APIs
     * @param constant
     * @param position
     * @return
     */
    public static String generateRequestTokenWithTimeStamp(String constant, String position){
        String token = "";
        String timestamp = new java.text.SimpleDateFormat("MM/dd/yyyy.HH:mm:ss.SSS").format(new Date());
        if("START".equals(position)){
            token = constant + "_" + timestamp;
        }else if("END".equals(position)){
            token= timestamp + "_" + constant;
        }
        return token;
    }

}

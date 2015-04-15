package org.yupii.thunderheadtools.service;

import org.joda.time.LocalTime;

/**
 * Thunderhead Reporting tool
 * <p/>
 * Author : VivekM - YourPartnersInIT - 1/23/15 - 3:19 PM
 */
public class Greeter {
    public String sayHello(){
        LocalTime currentTime = new LocalTime();
        return "Hola Mundo! Current Time is " + currentTime;
    }
}

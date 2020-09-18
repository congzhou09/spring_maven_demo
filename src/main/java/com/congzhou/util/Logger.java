package com.congzhou.util;

import java.util.Date;

public class Logger {
    public void log(String logContent){
        System.out.printf("%tT %s \n", new Date(), logContent);
    }
}

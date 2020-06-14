package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

    public void open() {
        System.out.println("Opening the settings Log");
    }

    public void close() {
        lastLog = "";
        loggerInstance = null;
        System.out.println("Closing the settings Log");
    }

    public boolean loadSettingLog() {
        System.out.println("Loading settings Log");
        return true;
    }
}

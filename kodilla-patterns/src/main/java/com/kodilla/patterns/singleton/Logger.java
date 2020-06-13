package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private static String lastLog = "";

    private Logger() {
    }

    public static Logger log(String log) {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    lastLog = log;
                    loggerInstance = new Logger();
                    System.out.println("Log: [" + log + "]");
                }
            }
        }
        return loggerInstance;
    }

    public static String getLastLog() {
        return lastLog;
    }

    public void open() {
        System.out.println("Opening the settings Log");
    }

    public static void close() {
        lastLog = "";
        loggerInstance = null;
        System.out.println("Closing the settings Log");
    }

    public static boolean loadSettingLog() {
        System.out.println("Loading settings Log");
        return true;
    }
}

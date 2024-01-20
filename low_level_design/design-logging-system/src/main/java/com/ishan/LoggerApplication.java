package com.ishan;

import com.ishan.handlers.*;
import com.ishan.model.LogMessage;
import com.ishan.model.LogRequestType;

/**
 * LoggerApplication is the entry point of the application.
 */
public class LoggerApplication {
    public static void main(String[] args) {

        LogManager logManager = new LogManager();
        LogHandler logger = logManager.initializeSystem(LogRequestType.INFO);

        LogMessage infoLogMessage = LogMessage.builder()
                .message("This is a info log message")
                .logRequestType(LogRequestType.INFO)
                .build();

        LogMessage errorLogMessage = LogMessage.builder()
                .message("This is a error log message")
                .logRequestType(LogRequestType.ERROR)
                .build();

        LogMessage debugLogMessage = LogMessage.builder()
                .message("This is a debug log message")
                .logRequestType(LogRequestType.DEBUG)
                .build();

        // this will be printed as the system log level is INFO
        logger.log(errorLogMessage);
        // this will be printed as the system log level is INFO
        logger.log(infoLogMessage);
        // This log will not be printed as the system log level is INFO and debug is not enabled
        logger.log(debugLogMessage);

    }
}

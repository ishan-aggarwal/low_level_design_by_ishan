package com.ishan;

import com.ishan.handlers.*;
import com.ishan.model.LogRequestType;

public class LogManager {
    public LogHandler initializeSystem(LogRequestType systemLogLevel) {
        // Initialize the system
        ErrorLogHandler errorLogHandler = new ErrorLogHandler();
        WarnLogHandler warnLogHandler = new WarnLogHandler();
        InfoLogHandler infoLogHandler = new InfoLogHandler();
        DebugLogHandler debugLogHandler = new DebugLogHandler();

        errorLogHandler.setNext(warnLogHandler)
                .setNext(infoLogHandler)
                .setNext(debugLogHandler);

        errorLogHandler.setSystemLogLevel(systemLogLevel);
        warnLogHandler.setSystemLogLevel(systemLogLevel);
        infoLogHandler.setSystemLogLevel(systemLogLevel);
        debugLogHandler.setSystemLogLevel(systemLogLevel);

        return errorLogHandler;
    }

}

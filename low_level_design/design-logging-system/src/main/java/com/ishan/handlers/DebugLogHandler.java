package com.ishan.handlers;

import com.ishan.model.LogMessage;
import com.ishan.model.LogRequestType;

public class DebugLogHandler extends LogHandler {
    @Override
    public void log(LogMessage message) {
        if (message.getLogRequestType() == LogRequestType.DEBUG) {
            System.out.println("Debug Log: " + message.getMessage());
        } else {

            // If the system log level is DEBUG, then we don't need to log any other type of log
            if (getSystemLogLevel() == LogRequestType.DEBUG) {
                return;
            }

            LogHandler next = getNext();
            if (next != null) {
                next.log(message);
            } else {
                System.out.println("No handler found for this log request type");
            }
        }
    }
}

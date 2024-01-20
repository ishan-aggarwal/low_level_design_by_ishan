package com.ishan.handlers;

import com.ishan.model.LogMessage;
import com.ishan.model.LogRequestType;

public class WarnLogHandler extends LogHandler {
    @Override
    public void log(LogMessage message) {
        if (message.getLogRequestType() == LogRequestType.WARN) {
            System.out.println("Warn Log: " + message.getMessage());
        } else {

            // If the system log level is WARN, then we don't need to log any other type of log
            if (getSystemLogLevel() == LogRequestType.WARN) {
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

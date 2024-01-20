package com.ishan.handlers;

import com.ishan.model.LogMessage;
import com.ishan.model.LogRequestType;

public abstract class LogHandler {
    protected LogHandler next;
    protected LogRequestType systemLogLevel;

    public void setSystemLogLevel(LogRequestType systemLogLevel) {
        this.systemLogLevel = systemLogLevel;
    }

    public LogRequestType getSystemLogLevel() {
        return systemLogLevel;
    }

    public LogHandler setNext(LogHandler next) {
        this.next = next;
        return next;
    }

    public LogHandler getNext() {
        return next;
    }

    public abstract void log(LogMessage message);
}

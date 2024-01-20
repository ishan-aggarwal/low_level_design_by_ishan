package com.ishan.model;

import com.ishan.model.LogRequestType;
import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LogMessage {

    private String message;
    private LogRequestType logRequestType;

}

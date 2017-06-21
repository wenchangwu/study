package com.oriental.finance;

import org.apache.commons.lang3.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;

public class Producer extends EndPoint{
     
    public Producer(String endPointName) throws Exception {
        super(endPointName);
    }
 
    public void sendMessage(Serializable object) throws IOException {
        channel.basicPublish("",endPointName, null, SerializationUtils.serialize(object));
    }  
}
package com.ww.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by wang on 15-3-24.
 */
public class ListenerOne implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage msg = (TextMessage) message;
        try {
            System.out.println("REC: "+msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

package com.ww.topic;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Created by wang on 15-3-24.
 */
public class TestMain {
    private SenderOne senderOne;
    private SenderTwo senderTwo;

    @Before
    public void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-jms-queue.xml");
        senderOne = (SenderOne) context.getBean("producer1");
        senderTwo = (SenderTwo) context.getBean("producer2");
    }


    @Test
    public void test(){
        senderOne.sendQueue();
        senderTwo.testTopic();
    }
}

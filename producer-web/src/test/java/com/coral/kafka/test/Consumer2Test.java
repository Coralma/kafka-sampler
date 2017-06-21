package com.coral.kafka.test;

import com.coral.base.kafka.SimpleConsumer;
import org.junit.Test;

/**
 * created by wks on date: 2017/2/16
 */
public class Consumer2Test {

    public static void main(String[] args){
        SimpleConsumer.consumeSingleTopic("kafka-sampler", new MessageWorker2());
        try {
            Thread.sleep(999999999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

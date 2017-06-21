package com.coral.kafka.test;

import com.coral.base.kafka.SimpleProducer;

/**
 * Created by ccc on 2017/6/1.
 */
public class ProducerTest {

    public static void main(String[] args){
        for(int i = 0; i < 10000; i++) {
            SimpleProducer.send("kafka-sampler", "test-" + i);
        }
    }
}

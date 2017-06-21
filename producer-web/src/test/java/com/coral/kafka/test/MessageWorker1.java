package com.coral.kafka.test;

import com.coral.base.kafka.SimpleConsumerWorker;
import com.coral.base.kafka.SimpleRecord;

import java.util.List;

/**
 * Created by ccc on 2017/6/1.
 */
public class MessageWorker1 implements SimpleConsumerWorker {

    @Override
    public void consume(List<SimpleRecord> list) {
        for (SimpleRecord record : list) {
            System.out.println(record.getTopic() + ", MessageWorker1, @@@@@@@@@@@@: " + record.getKey() + ", ++++++++++++++: " + record.getValue());
        }
    }
}

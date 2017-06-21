package com.coral.kafka.action;

import com.coral.base.kafka.SimpleProducer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/producer")
public class ProducerAction {

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public @ResponseBody
    String send(@RequestParam final String msg) {
        for(int i = 0; i < 100; i++) {
            SimpleProducer.send("kafka-sampler", "MESSAGE", msg + i);
        }
        return "Producer Message send at " + System.currentTimeMillis();
    }
}
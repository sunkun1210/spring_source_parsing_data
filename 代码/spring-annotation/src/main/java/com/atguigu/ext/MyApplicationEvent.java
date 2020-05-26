package com.atguigu.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.util.Date;


public class MyApplicationEvent extends ApplicationEvent {
    private Object source;
    private Date eventDate;

    public MyApplicationEvent(Object source,Date eventDate) {
        super(eventDate);
        this.source=source;
        System.out.println("我发布的事件");
    }

    @Override
    public String toString() {
        return "MyApplicationEvent{" +
                "source=" + source +
                ", eventDate=" + eventDate +
                '}';
    }
}

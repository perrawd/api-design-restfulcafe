package com.lnu.RESTfulCafe.event.bean;

import com.lnu.RESTfulCafe.model.bean.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Component;

@Component
public class BeanAddedEventPublisher {
    @Autowired
    private final ApplicationEventPublisher publisher;

    BeanAddedEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent(EntityModel<Bean> bean) {
        publisher.publishEvent(new BeanAddedEvent(this, bean));
    }
}

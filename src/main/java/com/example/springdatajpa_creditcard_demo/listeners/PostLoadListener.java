package com.example.springdatajpa_creditcard_demo.listeners;

import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.springframework.stereotype.Component;

@Component
public class PostLoadListener implements PostLoadEventListener{

    @Override
    public void onPostLoad(PostLoadEvent event) {
        System.out.println("I am post-load.....");
    }
    
}

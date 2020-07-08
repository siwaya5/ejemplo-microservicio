/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import akka.actor.Extension;
import akka.actor.Props;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Simon
 */
public class SpringExtension implements Extension {

    private ApplicationContext applicationContext;

    public void initialize(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Props props(String actorBeanName) {
        return Props.create(SpringActorProducer.class,
                applicationContext, actorBeanName);
    }

}

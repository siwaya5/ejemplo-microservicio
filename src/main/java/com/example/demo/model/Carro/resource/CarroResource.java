/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.Carro.resource;

import com.example.demo.actor.MyActor;
import com.example.demo.model.Carro.model.Carro;
import com.example.demo.model.Carro.service.CarroService;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.utilidades.ResponseUtil;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.pattern.Patterns;
import akka.util.Timeout;
import scala.concurrent.Await;
import scala.concurrent.Future;
import akka.actor.ActorRef;

/**
 *
 * @author Simon
 */
@RestController
@RequestMapping("/Carro")
public class CarroResource {

    @Autowired
    private CarroService carroService;

    private ActorRef myActor;

    @RequestMapping(value = "getAllCarro", method = RequestMethod.GET)
    public ResponseUtil findAllCarro() {
        return carroService.consultarAllCarro();
    }

    @RequestMapping(value = "getCarroById/{id}", method = RequestMethod.GET)
    public CarroDTO findCarroById(@PathVariable Long id) {
        return carroService.consultarCarroById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public CarroDTO guardarCarro(@RequestBody @Valid CarroDTO carro) {
        return carroService.guardarCarro(carro);
    }

    @RequestMapping(value = "getAkka", method = RequestMethod.GET)
    public Integer tryAkka() throws Exception {
//    	myActor = getContext().

//       ActorSystem<MyActor> mySystem = ActorSystem.create(MyActor.)
        final ActorSystem system = ActorSystem.create();
        system.actorOf(Props.create(MyActor.class)); 

        final ActorRef akkaBot = system.actorOf(Props.create(MyActor.class), "myActor");
//
//        akkaBot.tell(new Integer(1), ActorRef.noSender());
        
        Timeout t = new Timeout(5, TimeUnit.SECONDS);
        Future<Object> fut = Patterns.ask(akkaBot, new Integer(5), t);  
        Integer response = (Integer)Await.result(fut, t.duration());
        
        system.stop(akkaBot);
        
        return response;
    }


}

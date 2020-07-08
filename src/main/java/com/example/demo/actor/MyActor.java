package com.example.demo.actor;

import akka.actor.AbstractActor;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.Behaviors;

public class MyActor extends AbstractActor {
	int count = 0;
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(Integer.class, integer -> {onMessage(integer);})
				.build();
	}
	
	public void onMessage(Integer num) {
		
		Integer num2 = 0;
		num2+=num;
		
		getSender().tell(num2, getSelf());
		
	}

}

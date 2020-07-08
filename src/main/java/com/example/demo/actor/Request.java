package com.example.demo.actor;

import akka.actor.typed.ActorRef;

public class Request {
	public final String query;
	public final ActorRef<Response> replyTo;

	public Request(String query, ActorRef<Response> replyTo) {
		this.query = query;
		this.replyTo = replyTo;
	}
}

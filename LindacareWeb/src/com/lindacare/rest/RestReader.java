package com.lindacare.rest;

import java.util.Calendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;

import com.lindacare.db.LikeDb;
import com.lindacare.msg.InputMessage;
import com.lindacare.msg.SimpleMsg;

@Path("/msg")
public class RestReader {

	final Logger log = Logger.getLogger(RestReader.class);
	
	LikeDb db = LikeDb.getInstance();
	
	@POST
	@Path("/post")
	@Consumes("application/json")
	public void readMsg(InputMessage im) {
		
		im.setReceived(Calendar.getInstance().getTime());
		db.addMessage(im);
		
		log.info("Message received " + im.getUserId());
	}
}
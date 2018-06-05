package com.lindacare.db;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.lindacare.msg.InputMessage;

public class LikeDb {

	final static LikeDb instance = new LikeDb();
	
	final Logger log = Logger.getLogger(LikeDb.class);
	
	final ArrayList<InputMessage> lst = new ArrayList<InputMessage>();
	
	public static LikeDb getInstance(){
		return instance;
	}
	
    public LikeDb() {
    	
    	log.debug("Constrctor");
    }
	
    
    public ArrayList<InputMessage> getList(){
    	return lst;
    }
	
    
    public void addMessage(InputMessage s){
    	lst.add(s);
    }
    
    
}

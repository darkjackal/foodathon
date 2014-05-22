package com.jckl.foodathon.restlet.services;

import java.io.IOException;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

import com.google.gson.Gson;
import com.jckl.foodathon.dao.PMF;
import com.jckl.foodathon.model.StoreType;


/**
 * Resource which has only one representation.
 * 
 */
public class StoreTypeResource extends ServerResource {
	
	private static final Logger log = Logger.getLogger(StoreTypeResource.class.getName());

    @Put("json")
    public String addStoreType(Representation entity) {
    	
    	PersistenceManager pm = PMF.get().getPersistenceManager();
    	String returnString = "";
    	try{
    		JSONObject req = (new JsonRepresentation(entity)).getJsonObject();
    		Gson gson = new Gson();
    		
    		StoreType storeType = gson.fromJson(req.toString(), StoreType.class);
    		
    		//Add store type into datasource
			pm.makePersistent(storeType);
    		
			returnString = req.toString();
    	}catch(JSONException jsonEx){
    		jsonEx.printStackTrace();
    	}catch(IOException ioEx){
    		ioEx.printStackTrace();
    	}finally{
    		pm.close();
    	}
		return returnString;
    }
    
    @Get
    public String testGet() {
    	
    	//Will need to remove this
    	Gson gson = new Gson();
    	StoreType store = new StoreType("Spanish");
    	String jsonStore = gson.toJson(store);
    	
        return jsonStore;
    }
    
}

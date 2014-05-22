package com.jckl.foodathon;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Key;
import com.jckl.foodathon.dao.PMF;
import com.jckl.foodathon.model.Store;
import com.jckl.foodathon.model.StoreType;

@SuppressWarnings("serial")
public class FoodathonServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		

		StoreType storeType = new StoreType("Indian");
		Store store = new Store();
		store.setName("Muthu");
		Set<Key> types = new HashSet<Key>();
		types.add(store.getKey());
		store.setStoreTypes(types);
		
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try{
			pm.makePersistent(storeType);
			pm.makePersistent(store);
		} finally {
			pm.close();
		}
		
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}

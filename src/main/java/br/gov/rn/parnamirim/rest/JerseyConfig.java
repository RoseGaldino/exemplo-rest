package br.gov.rn.parnamirim.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("api")
public class JerseyConfig extends Application{
	
	public Map<String, Object> getProperties() {
		Map<String,Object> properties = new HashMap<String, Object>();
		properties.put("jersey.config.server.provider.packages", "br.gov.rn.parnamirim.rest");
		return properties;
	}


}

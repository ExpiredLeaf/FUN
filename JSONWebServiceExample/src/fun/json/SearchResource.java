package fun.json;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fun.searching.Search;

@Path("/Search")
public class SearchResource {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String SearchGetXml(){
		/*List<String> aux = Search.Linhas2("Arroz");
		GenericEntity<List<String>> entity = new GenericEntity<List<String>>(aux){};
		return Response.ok(entity).build();*/
		return Search.Linhas2("Arroz").toString();
	}
	
	@GET
	@Produces({MediaType.TEXT_XML})
	public String SearchGetHtml(){
		/*List<String> aux = Search.Linhas2("Arroz");
		GenericEntity<List<String>> entity = new GenericEntity<List<String>>(aux){};
		return Response.ok(entity).build();*/
		return Search.Linhas2("Arroz").toString();
	}

}

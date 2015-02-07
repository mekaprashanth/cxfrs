/**
 * 
 */
package com.prash.sample.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prash.sample.rest.values.CardInputDetails;
import com.prash.sample.rest.values.CardOutputDetails;

/**
 * @author prashanthmeka
 *
 */
@Path("/rest")
public class CardAccountService {
	
	@GET
	@Path("/fetchCardDetailsGet")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})	
	public CardOutputDetails fetchCardDetailsGet(CardInputDetails cardInputDetails) {
		System.out.println("REST Invoked in Get "+cardInputDetails);
		CardOutputDetails cardOutputDetails = new CardOutputDetails();
		cardOutputDetails.setCardNumber("300+"+cardInputDetails.getProxyNumber());
		cardOutputDetails.setCardBalance(100.00);
		cardOutputDetails.setCardStatus("ACTIVE");
		return cardOutputDetails;
	}
	
	@POST
	@Path("/fetchCardDetailsPost")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})	
	public CardOutputDetails fetchCardDetailsPost(CardInputDetails cardInputDetails) {
		System.out.println("REST Invoked in Post "+cardInputDetails);
		CardOutputDetails cardOutputDetails = new CardOutputDetails();
		cardOutputDetails.setCardNumber("300+"+cardInputDetails.getProxyNumber());
		cardOutputDetails.setCardBalance(100.00);
		cardOutputDetails.setCardStatus("ACTIVE");
		return cardOutputDetails;
	}

}

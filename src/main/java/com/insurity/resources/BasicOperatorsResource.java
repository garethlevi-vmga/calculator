package com.insurity.resources;

import com.insurity.resources.bodies.BodyBuilder;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author garethlevi
 */
@Path("/execute")
@Produces(MediaType.APPLICATION_JSON)
public class BasicOperatorsResource {

  private static final String SUM_PATH = "/sum";

  @POST
  @Path(SUM_PATH)
  public Response sum() {
    return Response.status(Response.Status.NOT_IMPLEMENTED).entity(BodyBuilder.notImplemented()).build();
  }

}

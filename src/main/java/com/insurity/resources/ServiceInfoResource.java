package com.insurity.resources;

import com.insurity.resources.bodies.BodyBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author garethlevi
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceInfoResource {

  private static final String VERSION_PATH = "version";

  private final String version;

  public ServiceInfoResource(String version) {
    this.version = version;
  }

  @GET
  @Path(VERSION_PATH)
  public Response version() {
    return Response.status(Response.Status.OK).entity(BodyBuilder.version(version)).build();
  }

}

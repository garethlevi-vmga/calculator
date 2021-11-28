package com.insurity.resources;

import com.insurity.resources.bodies.BodyBuilder;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author garethlevi
 */
@Path("/execute")
@Produces(MediaType.APPLICATION_JSON)
public class BasicOperatorsResource {

  private static final String SUM_PATH = "/sum";

  @POST
  @Path(SUM_PATH)
  public Response sum(@NotNull final List<BigDecimal> numbers) {
    BigDecimal sum = numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    return Response.status(Response.Status.OK).entity(BodyBuilder.sum(sum)).build();
  }

}

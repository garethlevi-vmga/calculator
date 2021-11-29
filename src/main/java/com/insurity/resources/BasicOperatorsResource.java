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
  private static final String PRODUCT_PATH = "/product";

  @POST
  @Path(SUM_PATH)
  public Response sum(@NotNull final List<BigDecimal> numbers) {
    BigDecimal sum = numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    return Response.status(Response.Status.OK).entity(BodyBuilder.sum(sum)).build();
  }

  @POST
  @Path(PRODUCT_PATH)
  public Response product(@NotNull final List<BigDecimal> numbers) {
    BigDecimal product = numbers.stream().reduce(BigDecimal.ONE, BigDecimal::multiply);
    return Response.status(Response.Status.OK).entity(BodyBuilder.product(product)).build();
  }

}

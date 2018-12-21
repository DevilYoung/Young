package com.xiaola.demo.webservice;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by xiaola on 18/12/19.
 */
@WebService
@Path(value = "users")
public interface UserService {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    List<User> GetUsers();

    @DELETE
    @Path("{id}")
    Response delete(@PathParam("id") int id);

    @POST
    @Path("add")
    Response insert(User user);

    @PUT
    @Path("update")
    Response update(User user);

    @GET
    @Path("{id}")
    User getUser(@PathParam("id") int id);

}

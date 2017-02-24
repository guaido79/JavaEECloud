/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo.bar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author guido
 */
@Path("messages")
public class CloudsResource {
    
    @GET
    public String helloWorld() {
        return "Hello World Updated " + System.currentTimeMillis();
    }
             
}

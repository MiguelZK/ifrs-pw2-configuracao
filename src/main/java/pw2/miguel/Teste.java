package pw2.miguel;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class Teste {
    
    @ConfigProperty(name="Ifrs.pw2", defaultValue="" )
    // Optional<String> instituto;
    String instituto;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Bem vindo à cadeira de " + instituto;
    }
}
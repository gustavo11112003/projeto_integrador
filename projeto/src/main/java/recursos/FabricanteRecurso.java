package recursos;

import java.util.List;

import entidades.Fabricante;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path ("fabricantes")
public class FabricanteRecurso {
       @GET
    public List<Fabricante> listar () {
        return Fabricante.listAll(Sort.ascending("nome"));
    }   

    @POST
    @Transactional
    public void salvar (Fabricante fabricante) {
        fabricante.persist();
    }
}
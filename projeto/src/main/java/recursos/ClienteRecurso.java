package recursos;

import java.util.List;


import entidades.Cliente;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path ("clientes")
public class ClienteRecurso {
     @GET
    public List<Cliente> listar () {
        return Cliente.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar (Cliente cliente) {
        cliente.persist();
    }
}
package recursos;

import java.util.List;

import entidades.Produto;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("produtos")
public class ProdutoRecurso {
    @GET
    public List<Produto> listar () {
        return Produto.listAll();
    }
    @POST
   @Transactional
    puplic void SAlvar (Produto produto) {
        produto.persist();
    }
}
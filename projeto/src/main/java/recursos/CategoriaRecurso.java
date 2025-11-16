package recursos;

import java.util.List;

import entidades.Categoria;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path ("categorias")
public class CategoriaRecurso {
     @GET
    public List<Categoria> listar () {
        return Categoria.listAll(Sort.ascending("nome"));
    }   

    @POST
    @Transactional
    public void salvar (Categoria categoria) {
        categoria.persist();
    }
}
package recursos;

import java.util.List;
import entidades.Venda;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("vendas")
public class VendaRecurso {
    
    @GET
    public List<Venda> listar() {
        return Venda.listAll(Sort.ascending("data"));
    }

    @POST
    @Transactional
    public void salvar(Venda venda) {
        venda.persist();
    }
}
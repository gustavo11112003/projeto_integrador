package recursos;

import java.util.List;

import entidades.ItemVenda;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path ("itemVenda")
public class ItemVendaRecurso {
     @GET
    public List<ItemVenda> listar () {
        return ItemVenda.listAll(Sort.ascending("codigo"));
    }

     @POST
    @Transactional
    public void salvar (ItemVenda itemVenda) {
        itemVenda.persist();
    }
}
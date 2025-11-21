package recursos;

import java.util.List;
import entidades.Funcionario;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("funcionarios")
public class FuncionarioRecurso {
    
    @GET
    public List<Funcionario> listar() {
        return Funcionario.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Funcionario funcionario) {
        funcionario.persist();
    }
}
package farmaciapro.farmacia.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CadastroProduto {

    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.GET)
    public void DoCadastrar (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().println("Cadastrar Produtos");
    }
    @RequestMapping(value = "/listarProduto", method = RequestMethod.POST)
    public void DoListar (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().println("Listagem de Produtos");
    }

}

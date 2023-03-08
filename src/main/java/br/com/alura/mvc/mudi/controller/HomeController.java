package br.com.alura.mvc.mudi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Notebook HP");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71YQOUHOggL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Notebook-HP-Intel-Core-256GB/dp/B0BQNXDG89?ref_=Oct_d_onr_d_16364755011_0&pd_rd_w=oxWhM&content-id=amzn1.sym.ce6bb5e2-cbbf-487e-845d-d1c264f71cb6&pf_rd_p=ce6bb5e2-cbbf-487e-845d-d1c264f71cb6&pf_rd_r=H289WFA97DTB13KG1FWY&pd_rd_wg=ilrZs&pd_rd_r=e1abd7ae-681f-43a3-b4fc-20fd294c15c9&pd_rd_i=B0BQNXDG89");
		pedido.setDescricaoProduto("Intel Core i3 8GB 256GB SSD 15,6” - Windows 11");
		
		List<Pedido> listaPedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", listaPedidos);
		
		return "home";
	}
	

}

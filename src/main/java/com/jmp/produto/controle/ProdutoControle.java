package com.jmp.produto.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.produto.modelo.ProdutoModelo;
import com.jmp.produto.modelo.RespostaModelo;
import com.jmp.produto.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/api")
public class ProdutoControle {
	
	@Autowired
	ProdutoRepositorio repositorio;
	
	@DeleteMapping("/produtos/{codigo}")
	public RespostaModelo remover(@PathVariable int codigo) {
		RespostaModelo resposta = new RespostaModelo();
		if(repositorio.existsById(codigo)) {			
			this.repositorio.deleteById(codigo);
			resposta.setMensagem("Produto Removido com sucesso");
		}else {
			resposta.setMensagem("Falha ao remover");			
		}
		return resposta;
	}
	
	@PutMapping("/produtos")
	public ProdutoModelo atualizar(@RequestBody ProdutoModelo produto) {
		return repositorio.save(produto);
	}
	
	@GetMapping("/produtos/{codigo}")
	public ProdutoModelo localizar(@PathVariable int codigo) {
		return repositorio.findById(codigo).orElse(null);		
	}
	
	@PostMapping("/produtos")
	public ProdutoModelo cadastrar(@RequestBody ProdutoModelo produto) {
		return repositorio.save(produto);
	}
	
	@GetMapping("/produtos")
	public List<ProdutoModelo> listar(){
		return repositorio.findAll();
	}
	
	@GetMapping("/inicio")
	public String inicio() {
		System.out.println("INICIO - IMPRIME NO CONSOLE");
		return "bem vindo";
	}
	
	@GetMapping("/contato")
	public String contato() {
		System.out.println("CONTATO - IMPRIME NO CONSOLE");
		return "Contato";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		System.out.println("SOBRE - IMPRIME NO CONSOLE");
		return "sobre";
	}
}

package com.jmp.produto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmp.produto.modelo.ProdutoModelo;

@Repository
public interface ProdutoRepositorio extends JpaRepository<ProdutoModelo, Integer>{
	//List<ProdutoModelo> findAll();
	//ProdutoModelo findByCodigo(int codigo);
	//void delete(ProdutoModelo produto);
	//<ProdMod extends ProdutoModelo> ProdMod save(ProdMod entity);
}

package com.fatec.sigvs.persitencia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.sigvs.IProdutoRepository;
import com.fatec.sigvs.model.Produto;
@SpringBootTest
class Req01CadastrarProdutoTest {
	@Autowired
	IProdutoRepository repository;

	@Test
	void ct01_cadastrar_produto_com_sucessso() {
		Produto produto1 = new Produto("eletrobomba 110v", "máquina de lavar", "22.30", "10");
		repository.save(produto1);
		assertEquals(1, repository.count());
	}
}

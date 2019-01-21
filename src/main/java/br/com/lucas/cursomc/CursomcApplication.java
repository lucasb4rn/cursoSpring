package br.com.lucas.cursomc;


import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.lucas.cursomc.domain.Categoria;
import br.com.lucas.cursomc.domain.Cidade;
import br.com.lucas.cursomc.domain.Cliente;
import br.com.lucas.cursomc.domain.Endereco;
import br.com.lucas.cursomc.domain.Estado;
import br.com.lucas.cursomc.domain.ItemPedido;
import br.com.lucas.cursomc.domain.Pagamento;
import br.com.lucas.cursomc.domain.PagamentoComBoleto;
import br.com.lucas.cursomc.domain.PagamentoComCartao;
import br.com.lucas.cursomc.domain.Pedido;
import br.com.lucas.cursomc.domain.Produto;
import br.com.lucas.cursomc.domain.enums.EstadoPagamento;
import br.com.lucas.cursomc.domain.enums.TipoCliente;
import br.com.lucas.cursomc.repository.CategoriaRepository;
import br.com.lucas.cursomc.repository.CidadeRepository;
import br.com.lucas.cursomc.repository.ClienteRepository;
import br.com.lucas.cursomc.repository.EnderecoRepository;
import br.com.lucas.cursomc.repository.EstadoRepository;
import br.com.lucas.cursomc.repository.ItemPeidoRepository;
import br.com.lucas.cursomc.repository.PagamentoRepository;
import br.com.lucas.cursomc.repository.PedidoRepository;
import br.com.lucas.cursomc.repository.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	}

}


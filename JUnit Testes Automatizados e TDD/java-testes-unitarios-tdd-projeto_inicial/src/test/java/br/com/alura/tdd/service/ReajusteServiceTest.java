package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach //JUnit, antes de cada um dos metodos, chame esse metodo
	public void inicializar() {
		service = new ReajusteService();
		funcionario = new Funcionario("Adam", LocalDate.now(), new BigDecimal("1000"));
	}
	 
	//JUnit, executar toda vez ao finalizar cada metodo @AfterEach
	//Roda uma unica vez antes de rodar todos testes, tem q ser estaticos @BeforeAll
	//Roda uma unica vez depois de todos testes executados, tem q ser estaticos  @AfterAll
	

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {

		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {

		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}

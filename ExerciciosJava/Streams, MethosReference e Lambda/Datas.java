import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		//Api de datas, assim como stream e collector elas sao novas no java8
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2023 , Month.AUGUST, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo);
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		//Vamos formatar a data para dd/MM/yyyy
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyyy");
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		//Formatador com horas: 
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyyy hh:mm");

		//Se quiser hh:mm:ss usamos o LocalDatetime
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		//Para usar so mes e ano
		YearMonth mes = YearMonth.now();
		//Formatando
		DateTimeFormatter formatadorMesEAno = DateTimeFormatter.ofPattern("MM/yyyyy");
		System.out.println(mes.format(formatadorMesEAno));
		
		//Criando um LocalDate para representar um dia em especifico
		LocalDate diaAniversarioMeu = LocalDate.of(1995, Month.DECEMBER, 28);
		//Formatando a data do dia do meu aniversario
		DateTimeFormatter formatadorAniversario = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(diaAniversarioMeu.format(formatadorAniversario));
		
	}

}

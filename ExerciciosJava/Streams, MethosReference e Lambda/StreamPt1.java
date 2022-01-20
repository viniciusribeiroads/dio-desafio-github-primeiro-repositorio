import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class StreamPt1 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		cursos.add(new Curso("Delphi", 3));
		
		//Comparando usando lambda com base no numero de alunos
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		//Foreach usando lambda
		cursos.forEach( s -> System.out.println(s.getNome()));
		
		//Apos o java8 temos o método stream para 'filtrar' em nossas colections
		//Filtrando e exibindo cursos que tem mais dd 100 alunos
		System.out.println("Filtrando e exibindo cursos que tem mais de 100 alunos: ");
		cursos.stream().filter( c -> c.getAlunos() >= 100).forEach( c -> System.out.println(c.getNome()));
		
		System.out.println("Exibindo quantos alunos tem nos cursos que tem mais de 100 alunos: ");
		//Exibindo quantos alunos tem nos cursos que tem mais de 100 alunos
		cursos.stream().filter(c -> c.getAlunos() >= 100).map( c -> c.getAlunos()).forEach(total -> System.out.println(total));
		
		//Vamos somar agora todos alunos 
		System.out.println("Somando todos alunos de cursos acima de 100 pessoas: ");
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
		System.out.println(sum);
	}
	
	
	public static class Curso {
		
		private String nome;
		private int alunos;
		
		public Curso(String nome, int alunos) {
			this.nome = nome;
			this.alunos = alunos;
			
		}

		public String getNome() {
			return nome;
		}

		public int getAlunos() {
			return alunos;
		}
		
		
	}

}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		//Lambda do sort(compare) 
		palavras.sort( (String o1, String o2) -> {
				if (o1.length() > o2.length())
					return -1;
				if (o1.length() < o2.length())
					return 1;
				return 0;
			});
		
		
		//Usando factory dentro da interface comparator que utiliza uma lambda
		//que pega o tamanho da primeira String, depois da segunda e ordena de acordo
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		
		// Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		

		// Usando metodo forach com consumer em funcao anonima
		palavras.forEach( t  ->  System.out.println(t));
		
		

	}

}

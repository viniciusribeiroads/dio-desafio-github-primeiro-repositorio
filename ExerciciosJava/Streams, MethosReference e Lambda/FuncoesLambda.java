import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class FuncoesLambda {

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
		
		//Lambda usando integer.compare
		palavras.sort( (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		// Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		

		// Usando metodo forach com consumer em funcao anonima
		palavras.forEach( t  ->  System.out.println(t));
		
		

	}

}

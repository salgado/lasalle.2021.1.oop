import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {
		String arquivo = "/Users/alex/temp/votacao.csv";
		
		List<Voto> apuracao = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader( new FileReader(arquivo) ))
		{
			String linha = br.readLine();
			while(linha != null)
			{
				String[] votos = linha.split(",");
				Voto voto = new Voto(votos[0], Integer.parseInt(votos[1]) );
				
				apuracao.add(voto);
				
				System.out.println(linha);
				linha = br.readLine();
			}
			
		} catch (Exception e)
		{
			System.out.println("Erro ao tentar ler o arquivo!!" + e.getMessage());
		}

		//apuracao
		System.out.println("Apuração dos Votos");
		System.out.println("----------------------");
		for (Voto voto : apuracao) {
			
			System.out.println("Candidato:" + voto.getNome() + 
					" - Votos:" + voto.getQtdVotos());
		}
		
		//apuracao ordenada por qtd de votos
		Collections.sort(apuracao);
		
		//apuracao ordenada
		System.out.println("Apuração Ordenada dos Votos");
		System.out.println("----------------------");
		for (Voto voto : apuracao) {
			
			System.out.println("Candidato:" + voto.getNome() + 
					" - Votos:" + voto.getQtdVotos());
		}
		
		//apurar o vencedor
		Map<String, Integer> rank = new HashMap<>();
		
		for (Voto voto : apuracao) {
			
			if(rank.get(voto.getNome()) == null)
			{
				//entrando pela primeira vez na hash
				rank.put(voto.getNome(), voto.getQtdVotos());
			}
			else
			{
				//acumula o voto
				Integer acumVoto = rank.get(voto.getNome() ); 
				rank.put(voto.getNome(), voto.getQtdVotos() + acumVoto  );
			}		
			
		}
		
		//mostrar resultado final
		System.out.println("Rank Final");
		System.out.println("-------------");
		for(Map.Entry<String, Integer> r1 : rank.entrySet())
		{
			System.out.println(r1);
		}
		
		
		
	}

}

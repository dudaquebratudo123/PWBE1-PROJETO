package pacote;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJson {
	
	public static void main(String[]args) {
		
		try {
			ObjectMapper objeto = new ObjectMapper();
			
			//objeto para usar na serialização
			Pessoa pes = new Pessoa("dudamasco", 16); 
			
			//serializar o obj pes
			String json = objeto.writeValueAsString(pes);
			System.out.println("Objeto serializado");
			System.out.println(json);
			
			//desserializar
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj Pessoa:");
			System.out.println("Nome: " + desPessoa.getNome() + "\nIdade: " + desPessoa.getIdade());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}//fim main
	
}//fim classe

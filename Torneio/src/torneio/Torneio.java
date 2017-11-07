package torneio;
public class Torneio {

    public static void main(String[] args) {
    	
    	//Criação dos técnicos
    	Tecnico tecLagoa = new Tecnico("Luiz Felipe", 56);
    	tecLagoa.setTelefone(88888888);
    	Tecnico tecMesse = new Tecnico("Zagallo", 75);
    	tecMesse.setTelefone(99999999);

    	//Criação dos Jogadores em array - Jogadores do Time jLagoa
        Jogador jLagoa[] = new Jogador[3];
        
        jLagoa[0] = new Jogador("Rony", 32);
        jLagoa[0].setNumeroCamisa(9);
        jLagoa[0].setGols();
        
        jLagoa[1] = new Jogador("Luiz", 5);
        jLagoa[1].setNumeroCamisa(7);
        jLagoa[1].setGols();
        jLagoa[1].setGols();
        
        jLagoa[2] = new Jogador("Davi", 2);
        jLagoa[2].setNumeroCamisa(4);

      //Criação dos Jogadores em array - Jogadores do Time jMesse
        Jogador jMesse[] = new Jogador[3];
        
        jMesse[0] = new Jogador ("Marcos", 22);
        jMesse[0].setNumeroCamisa(7);
        jMesse[0].setGols();
        
        jMesse[1] = new Jogador ("Fernando", 18);
        jMesse[1].setNumeroCamisa(9);
        jMesse[1].setGols();
        jMesse[1].setGols();
        jMesse[1].setGols();

        jMesse[2] = new Jogador ("Antonio", 23);
        jMesse[2].setNumeroCamisa(2);
        
        //Criação dos times
        Time tLagoa = new Time("Lagoa", tecLagoa, "Lagoa Redonda", jLagoa);
        System.out.println(tLagoa + "\n");
       
        Time tMesse = new Time("Da rua", tecMesse, "Messejana", jMesse);
        System.out.println(tMesse);
    }
    
}

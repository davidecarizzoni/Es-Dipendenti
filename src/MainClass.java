import java.util.*;


public class MainClass 
{

	public static void main(String[] args) 
	{
		/*Data da1=new Data(1,1,1980);
		Data da2=new Data(1,1,1981);
		Data da3=new Data(1,1,1963);
		Data da4=new Data(1,1,1983);
		Data da5=new Data(1,1,1975);

		Dipendente d1=new Dipendente(1,"Davide",da1,1999,6);
		Dipendente d2=new Dipendente(2,"Mario",da2,1980,5);
		Dipendente d3=new Dipendente(3,"Luca",da3,1994,3);
		Dipendente d4=new Dipendente(4,"Paolo",da4,1997,2);
		Dipendente d5=new Dipendente(5,"Giovanni",da5,1998,4);
		
		Dipendente elencoDipendenti[]=new Dipendente[5];
		
		elencoDipendenti[0]=d1;
		elencoDipendenti[1]=d2;
		elencoDipendenti[2]=d3;
		elencoDipendenti[3]=d4;
		elencoDipendenti[4]=d5;
		*/
		int n;
		int matricola;
		String nominativo;
		int giorno,mese,anno;
		Data dataNascita;
		int annoAssunzione;
		int livelloRetributivo;
		
		Scanner tastiera=new Scanner(System.in);
		System.out.print("Inserire il numero di dipendenti da inserire nell'array: ");
		n=tastiera.nextInt();
		
		Dipendente elencoDipendenti[]=new Dipendente[n];
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
		
			
			System.out.println("DIPENDENTE "+(i+1));
			System.out.print("Inserire la matricola: ");
			matricola=tastiera.nextInt();
			
			tastiera.nextLine();
			System.out.print("Inserire il nominativo: ");
			nominativo=tastiera.nextLine();
			
			System.out.println("DATA DI NASCITA--> ");
			System.out.print("Giorno:");giorno=tastiera.nextInt();
			System.out.print("Mese:");mese=tastiera.nextInt();
			System.out.print("Anno:");anno=tastiera.nextInt();
			dataNascita=new Data(giorno,mese,anno);
			
			System.out.print("Inserire anno assunzione: ");
			annoAssunzione=tastiera.nextInt();
			
			System.out.print("Inserire livello retributivo: ");
			livelloRetributivo=tastiera.nextInt();
			
			
			elencoDipendenti[i]=new Dipendente(matricola,nominativo,dataNascita,annoAssunzione, livelloRetributivo);
			tastiera.close();
		}
		
	
		Dipendente anziano=elencoDipendenti[0];
		Dipendente piuPagato=elencoDipendenti[0];
		
		System.out.println("VISUALIZZAZIONE ELENCO DATI DIPENDENTI");
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			System.out.println(elencoDipendenti[i].toString());
		}
		
		
		for (int i = 0; i < elencoDipendenti.length; i++)
		{
			if(elencoDipendenti[i].getDataNascita().compareData(anziano.getDataNascita())==1)
				anziano=elencoDipendenti[i];
		}
		System.out.println("PIU' ANZIANO: "+anziano.toString());		
		
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if(piuPagato.stipendio()<elencoDipendenti[i].stipendio())
				piuPagato=elencoDipendenti[i];
		}
		System.out.print("PIU' PAGATO: "+piuPagato.toString());	
	
	
	
	
	}
}
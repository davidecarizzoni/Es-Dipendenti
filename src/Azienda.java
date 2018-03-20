public class Azienda 
{
	//attributi
	private final static int MAX_NUM_DIPENDENTI=1000;
	private Dipendente azienda[];
	
	//costruttore
	public Azienda()
	{
		azienda=new Dipendente[MAX_NUM_DIPENDENTI];
	}
	//costruttore copia

	//altri metodi
	public void setDipendente(Dipendente d)
	{
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if(azienda[i]==null)
			{
				azienda[i]=d;	
				return;
			}
		}
	}
	
	public Dipendente getDipendente(String nominativo)
	{
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if(azienda[i].getNominativo().compareToIgnoreCase(nominativo)==0)
				return azienda[i];
		}
		return null;
	}
	
	public Dipendente[] dipendentiStipendio(int stipendio)
	{
		Dipendente ElencoStipendi[]=new Dipendente[MAX_NUM_DIPENDENTI];
		
		for (int i = 0; i < ElencoStipendi.length; i++) 
		{
			if(azienda[i].stipendio()==stipendio)
			{
				for (int j = 0; j < MAX_NUM_DIPENDENTI; j++) 
				{
					ElencoStipendi[j]=azienda[i];
				}
			}
		}
		return ElencoStipendi;
	}
	
	public Dipendente dipendenteStipendioMaggiore()
	{
		Dipendente piuPagato=azienda[0];
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if(azienda[i].stipendio()> piuPagato.stipendio())
				piuPagato=azienda[i];
		}
		return piuPagato;
	}
	
	public Dipendente dipendentePiuGiovane()
	{
		Dipendente piuGiovane=azienda[0];
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if(azienda[i].getDataNascita().compareData(piuGiovane.getDataNascita())==-1)
				piuGiovane=azienda[i];
		}
		return piuGiovane;
	}
	
	public String toString()
	{
		String risultato="";
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if(azienda[i]!=null)
				risultato+=azienda[i].toString()+"\n";
		}
		return risultato;
	}
	
 }

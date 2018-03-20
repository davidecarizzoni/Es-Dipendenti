import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dipendente
{
	//attributi
	private int matricola;
	private String nominativo;
	private Data dataNascita;
	private int annoAssunzione;
	private int livelloRetributivo;
	private static int contributoAnzianita=50;
	private static int contributoLivello=25;
	private final int BASE_FISSA_STIPENDIO=800;
	
	//Costruttore
	public Dipendente(int matricola, String nominativo,Data dataNascita, int annoAssunzione, int livelloRetributivo)
	{
		setMatricola(matricola);
		setNominativo(nominativo);
		setDataNascita(dataNascita);
		setAnnoAssunzione(annoAssunzione);
		setLivelloRetributivo(livelloRetributivo);
	}
	
	//Costruttore copia
	public Dipendente(Dipendente dipendente)
	{
		setMatricola(dipendente.getMatricola());
		setNominativo(dipendente.getNominativo());
		setDataNascita(dipendente.getDataNascita());
		setAnnoAssunzione(dipendente.getAnnoAssunzione());
		setLivelloRetributivo(dipendente.getLivelloRetributivo());
	}
	
	
	//getter e setter
	public int getMatricola() 
	{
		return matricola;
	}
	public void setMatricola(int matricola) 
	{
		this.matricola = matricola;
	}
	public String getNominativo() 
	{
		return nominativo;
	}
	public void setNominativo(String nominativo) 
	{
		this.nominativo = nominativo;
	}
	public Data getDataNascita() 
	{
		return dataNascita;
	}
	public void setDataNascita(Data dataNascita) 
	{
		this.dataNascita = new Data(dataNascita);
	}
	public int getAnnoAssunzione() 
	{
		return annoAssunzione;
	}
	public void setAnnoAssunzione(int annoAssunzione) 
	{
		this.annoAssunzione = annoAssunzione;
	}
	public int getLivelloRetributivo() 
	{
		return livelloRetributivo;
	}
	public void setLivelloRetributivo(int livelloRetributivo) 
	{
		if(livelloRetributivo<1)
			this.livelloRetributivo=1;
		else if(livelloRetributivo>6)
			this.livelloRetributivo=6;
		else
			this.livelloRetributivo = livelloRetributivo;
	}
	public static int getContributoAnzianita() 
	{
		return contributoAnzianita;
	}
	public static void setContributoAnzianita(int contributoAnzianita) 
	{
		Dipendente.contributoAnzianita = contributoAnzianita;
	}
	public static int getContributoLivello() 
	{
		return contributoLivello;
	}
	public static void setContributoLivello(int contributoLivello) 
	{
		Dipendente.contributoLivello = contributoLivello;
	}
	
	//altri metodi
	public int stipendio()
	{
		GregorianCalendar gc=new GregorianCalendar();
		int anno=gc.get(Calendar.YEAR);
		return BASE_FISSA_STIPENDIO+((anno-getAnnoAssunzione())* getContributoAnzianita()) +(getLivelloRetributivo()*getContributoLivello());
	}
	
	public String toString()
	{
		return "Matricola:"+ getMatricola()+". Nominativo: "+getNominativo()+"\nData di Nascita--> "+getDataNascita()+". Anno assunzione:"+getAnnoAssunzione()+". Livello retributivo: "+getLivelloRetributivo()+". STIPENDIO:"+stipendio()+"€";	
	}
	
}

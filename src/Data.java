public class Data 
{
	//attributi
	private int giorno;
	private int mese;
	private int anno;
	
	//costruttore
	public Data(int giorno, int mese, int anno)
	{
		setGiorno(giorno);
		setMese(mese);
		setAnno(anno);
	}
	
	//costruttore copia
	public Data(Data data)
	{
		setGiorno(data.getGiorno());
		setMese(data.getMese());
		setAnno(data.getAnno());
	}
	
	
	//setter e getter
	public int getGiorno() 
	{
		return giorno;
	}
	public void setGiorno(int giorno) 
	{
		if(giorno<1 || giorno>31)
			this.giorno=1;
		else
			this.giorno = giorno;
	}
	public int getMese() 
	{
		return mese;
	}
	public void setMese(int mese) 
	{
		if(mese<1 || mese>12)
			this.mese=1;
		else
			this.mese = mese;
	}
	public int getAnno() 
	{
		return anno;
	}
	public void setAnno(int anno) 
	{
		if(anno<1900 || anno>2500)
			this.anno=1900;
		else
			this.anno = anno;
	}
	
	//altri metodi
	public String toString()
	{
		return getGiorno()+"/ "+getMese()+"/ "+getAnno();
		
	}
	public int compareData(Data data)
	{
		if(data.getAnno()>getAnno())
			return 1;
		else if(data.getAnno()<getAnno())
			return -1;
		else
		{
			if(data.getMese()>getMese())
				return 1;
			else if(data.getMese()<getMese())
				return -1;
			else
			{
				if(data.getGiorno()>getGiorno())
					return 1;
				else if(data.getGiorno()<getGiorno())
					return -1;
				else
					return 0;
			}
		}
	}






}

package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = ("That is so mainstream!");
		hipsterPhrases[1] = ("I don't mean to sound like a hipster, but, did you even read Harry Potter?");
		hipsterPhrases[2] = ("Do you even like kale?");
		hipsterPhrases[3] = ("I was into everything before it was cool");
	}
	
	public Hipster (String name)
	{
		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
}

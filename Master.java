package test1;

import test1.Smen;

class Master
{
private String name; // Название мастерской
private String adress; // Адрес мастерской
private Smen[] smen;

public Master(String name, String adress, Smen[] smens) {
	super();
	this.name = name;
	this.adress = adress;
	this.smen = smens;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public Smen[] getSmen() {
	return smen;
}

public void setSmen(Smen[] smen) {
	this.smen = smen;
}

public int testWord()
{
return getAdress().length();
}

public String maxComp()
{
	Smen smena = smen[0];
	for(int i = 0; i < smen.length; i++)
	{if (smena.getCompRep() < smen[i].getCompRep())
		smena = smen[i];}
	return smena.getSmena();
	
}

public int Suma()
{
	int k = 0;
	for(int i = 0; i < smen.length; i++)
	{k = k + smen[i].getCompRep();}
	return k;
	
}

public static void main(String[] arg)
{
	Smen[] smen = {
			new Smen(4, "First"),
			new Smen(6, "Second"),
			new Smen(3, "Third"),
			new Smen(5, "Fouth")};
	
	Master master = new Master("Colos", "ул. Лермонтова 14", smen);
			
	System.out.println("The lenhgt of name is " + master.testWord());
	System.out.println("The repair comp is " + master.maxComp());
	System.out.println("Sum of rep comps " + master.Suma());
}
}
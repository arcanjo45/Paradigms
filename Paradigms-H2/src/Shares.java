
public class Shares {
private double value;
private Company comp;

public Shares(double value,Company comp){
	this.value = value;
	this.comp = comp;
}

public double getValue()
{
	return value;
}

public Company getCompany()
{
	return comp;
}


}

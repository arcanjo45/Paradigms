import java.util.ArrayList;

public class Portfolio {
private ArrayList<Shares>shares;
private int noShares;

public Portfolio()
{
	 shares = new ArrayList<>();
}

public ArrayList<Shares> getShares()
{
	return shares;
}

public int getNoShares()
{
	return noShares;
}

public void addShare(Shares s1)
{
	shares.add(s1);
}

public double computeSum()
{
	double sum=0;
	for(int i=0; i < getShares().size();i++)
	{
		sum += getShares().get(i).getValue();
	}
	return sum;
}
}

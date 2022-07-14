import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProfileEconomy {
	
	private double totalBalance = 0.0;
	/*da modificare in base a come scegliamo di di costruire gli oggetti*/
	private int nBankAaccounts = 0; /*conti bancari*/
	private int nShares = 0;
	private int nCrypto = 0;
	private int nCoinBanks = 0; /*salvadanai, non sapevo come chiamarli*/ 
	
	public ProfileEconomy(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public Map<String,Integer> getEconomy() {
		return Collections.unmodifiableMap(mapEconomy());
	}
	
	private Map<String,Integer> mapEconomy(){
		Map<String, Integer> map = new HashMap<>();
		map.put("nBankAaccounts", this.nBankAaccounts);
		map.put("nShares", this.nShares);
		map.put("nCrypto", this.nCrypto);
		map.put("nCoinBanks", this.nCoinBanks);
		return map;
	}
	
	public double getTotalBalance() {
		return this.totalBalance;
	}
	
	public void addBankAccount(int n) {
		this.nBankAaccounts += n;
	}
	
    public void addShares(int n) {
		this.nShares += n;
	}
    
    public void addCrypto(int n) {
    	this.nCrypto += n;
    }
    
    public void addCoinBanks(int n) {
    	this.nCoinBanks += n;
    }

}

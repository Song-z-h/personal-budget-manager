import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProfileEconomy {
	
	private int nAaccounts = 0;
	private int nShares = 0;
	private int nCrypto = 0;
	private int nCoinBanks = 0;
	
	public ProfileEconomy(int nAccount, int nShares,int nCrypto, int nCoinBanks) {
		this.nAaccounts = nAccount;
		this.nShares = nShares;
		this.nCrypto = nCrypto;
		this.nCoinBanks = nCoinBanks;
	}
	
	public Map<String,Integer> getEconomy() {
		return Collections.unmodifiableMap(mapEconomy());
	}
	
	private Map<String,Integer> mapEconomy(){
		Map<String, Integer> map = new HashMap<>();
		map.put("nAccounts", this.nAaccounts);
		map.put("nShares", this.nShares);
		map.put("nCrypto", this.nCrypto);
		map.put("nCoinBanks", this.nCoinBanks);
		return map;
	}
	
	public void addAccount() {
		this.nAaccounts++;
	}
	
    public void addShares() {
		this.nShares++;
	}
    
    public void addCrypto() {
    	this.nCrypto++;	
    }
    
    public void addCoinBanks() {
    	this.nCoinBanks++;	
    }

}

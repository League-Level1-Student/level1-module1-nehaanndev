package _06_vault;

import java.util.Random;

public class VaultRunner {

	public static void main (String[] args) {
		
		Vault v = new Vault();
		SecretAgent a = new SecretAgent();
		
		System.out.print("The code for the vault is " + a.findCode(v)+ ".");
	}
}

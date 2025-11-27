package _06_vault;

public class SecretAgent {

	

	public Integer findCode(Vault v){
		
		Boolean res = false;
		int code = 0;
		
		while (res == false) {
			res = v.tryCode(code);

			if(res == true){
				break;
				
			}
			code +=1;
		}
		return code;
		
	}
}

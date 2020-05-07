package Validador;

import javax.jws.WebService;

@WebService(endpointInterface = "Validador.ValidadorServer")

public class ValidadorServerImp implements ValidadorServer{
		     
	public String valida(String crm) {
		
		char digito = crm.charAt(6);
		
		if (crm.length() == 9 && digito == '-') {
			System.out.println("CRM: " + crm +  " VALIDO");
			return "CRM: "+ crm + " VALIDO";
		}
		else {
			System.out.println("CRM: " + crm + " INVALIDO");
			return "CRM: "+ crm + " INVALIDO";
		}
	}	
 
}

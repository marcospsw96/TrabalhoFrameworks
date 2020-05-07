package Validador;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ValidadorCliente {

	public static void main(String args[]) throws Exception {
	    URL url = new URL("http://127.0.0.1:9876/Valida?wsdl");
	    QName qname = new QName("http://Validador/","ValidadorServerImpService");
	    Service ws = Service.create(url, qname);
	    ValidadorServer val = ws.getPort(ValidadorServer.class);
	 
	    System.out.println(val.valida("545256-80"));
	    System.out.println(val.valida("5452056-80"));
	    System.out.println(val.valida("54556-80"));
	}
	
}
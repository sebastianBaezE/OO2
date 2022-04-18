package ej3p3;

public class Connection4G{
	
	private String symb;
	
	public Connection4G() {
		this.symb="Conectado a 4G";
	}

	public String transmit(String data, Integer crc) {
		return "Se envio data por 4G";
	}
	
	public String getSymb() {
		return this.symb;
	}

}

package ej3p3;

public class WifiConn implements Connection {

	@Override
	public String sendData(String data, Integer crc) {
		return "Se envio data por WifiConn";
	}

	@Override
	public String pict() {
		return "Conectado a Wifi";
	}
	


}

package ej3p3;

public class Adapter4G implements Connection{

	private Connection4G connection4G;
	
	public Adapter4G (){
		this.connection4G=new Connection4G();
	}
	
	@Override
	public String sendData(String data, Integer crc) {
		return this.connection4G.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.connection4G.getSymb();
	}

}

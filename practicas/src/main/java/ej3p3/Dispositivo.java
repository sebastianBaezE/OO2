package ej3p3;

public class Dispositivo {
	
	private Connection connection;
	private Ringer ringer;
	private Calculator crcCalculator;
	
	public Dispositivo(Calculator crc) {
		this.connection=new Adapter4G();
		this.ringer=new Ringer();
		this.crcCalculator=crc;
	}
	
	public String changeConnection(Connection connection) {
		this.connection = connection;
		System.out.println(this.connection.pict());
		ringer.ring();
		return this.connection.pict();
	}
	
	public void setRinger(Ringer ringer) {
		this.ringer = ringer;
	}
	
	public void setCrcCalculator(Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
	
	public String send(String data) {
		Integer crc=this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	

}

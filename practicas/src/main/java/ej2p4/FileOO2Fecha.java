package ej2p4;



public class FileOO2Fecha extends BaseDecorator{
	
	public FileOO2Fecha(PrettyFile file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.aPrettyFile.prettyPrint()+" - "+this.aPrettyFile.getFecha_creacion();
	}


}

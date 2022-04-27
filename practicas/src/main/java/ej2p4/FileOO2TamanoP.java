package ej2p4;


public class FileOO2TamanoP extends BaseDecorator {

	public FileOO2TamanoP(PrettyFile file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.aPrettyFile.getPermisos()+" - "+this.aPrettyFile.getNombre()
				+" - "+this.aPrettyFile.getExtension()+" - "+this.aPrettyFile.getTamano();
	}




}

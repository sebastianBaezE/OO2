package ej2p4;


public abstract class BaseDecorator implements PrettyFile{

	protected PrettyFile aPrettyFile;

	public BaseDecorator(PrettyFile file) {
		this.aPrettyFile=file;
	}

	@Override
	public String getNombre() {
		return this.aPrettyFile.getNombre();
	}

	@Override
	public String getFecha_creacion() {
		return this.aPrettyFile.getFecha_creacion();
	}
	
	@Override
	public String getPermisos() {
		return this.aPrettyFile.getPermisos();
	}

	@Override
	public String getTamano() {
		return this.aPrettyFile.getTamano();
	}
	
	public String getExtension() {
		return this.aPrettyFile.getExtension();
	}
	
	




}
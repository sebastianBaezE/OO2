package ej3p3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {

	@Override
	public Integer crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return (int) result;
	}
	

}

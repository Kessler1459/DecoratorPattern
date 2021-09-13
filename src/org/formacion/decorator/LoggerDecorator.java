package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {
	private Logger logger;
	private BaseDatos bd;

	public LoggerDecorator(Logger logger, BaseDatos bd) {
		this.logger = logger;
		this.bd = bd;
	}

	@Override
	public void inserta(String registro) {
		bd.inserta(registro);
		logger.add("inserta "+registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return bd.registros();
	}

}

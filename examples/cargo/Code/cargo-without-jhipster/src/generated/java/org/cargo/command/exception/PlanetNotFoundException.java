package org.cargo.command.exception;

import org.sculptor.framework.errorhandling.ApplicationException;

public class PlanetNotFoundException extends ApplicationException {
	private static final long serialVersionUID = 1L;
	private static final String CLASS_NAME = PlanetNotFoundException.class.getSimpleName();
	private static final String CLASS_FULL_NAME = PlanetNotFoundException.class.getName();

	public PlanetNotFoundException(String m, java.io.Serializable... messageParameter) {
		super(CLASS_FULL_NAME, m);
		setMessageParameters(messageParameter);
	}

	public PlanetNotFoundException(int errorCode, String m, java.io.Serializable... messageParameter) {
		super(String.format("%1$s-%3$04d", CLASS_FULL_NAME, CLASS_NAME, errorCode), m);
		setMessageParameters(messageParameter);
	}
}

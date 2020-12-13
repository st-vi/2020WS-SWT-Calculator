package de.uulm.sp.swt.profcalculator;

public class Logger {
	
	private final static boolean LOGGING = true; 
	
	private static Logger logger = new Logger();
	
	public Logger() {
		log("Logging enabled:");
	}

	public static Logger getLogger() {
		return logger;
	}

	public void log(String message) {
		if (LOGGING) {
			System.out.println(message);
		}
	}

}

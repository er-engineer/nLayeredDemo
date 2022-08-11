package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
	
	
	@Override
	public void log(String message) {
		JLoggerManager jLoggerManager = new JLoggerManager();
		jLoggerManager.log(message);
		
	}

}

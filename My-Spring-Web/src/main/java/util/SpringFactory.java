package util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringFactory implements ApplicationContextAware {
	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
		this.applicationContext = applicationContext;		
	}
	
	public ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	
	public static Object getBeans(String id){
		return applicationContext.getBean(id);
	}
}

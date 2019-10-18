package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsXmlApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("{}", xmlPersonDao);
			LOGGER.info("{}", xmlPersonDao.getXmlJdbcConnection());
		}
	}

}

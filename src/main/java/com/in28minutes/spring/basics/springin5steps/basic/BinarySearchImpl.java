package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		this.sortAlgorithm.sort(numbers);
		
		//Search array
		//Return the result
		System.out.println(sortAlgorithm);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("POST CONSTRUCT");
	}	
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("PRE DESTROY");
	}	
}

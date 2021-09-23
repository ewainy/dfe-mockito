package com.qa.personexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MenuTestSol {

	@Mock
	PersonCreator creator;
	
	@InjectMocks
	Menu menu;
	
	@Test
	public void fullPersonTest() { 
		final String name = "Bob Smith", jobTitle = "Dev";
		final int age = 25;
		final Person created = new Person(name, jobTitle, age);
		
		Mockito.when(creator.createFullPerson(name, jobTitle, age)).thenReturn(created);
		
		assertEquals(created, menu.createFullPerson(name, jobTitle, age));
		
		Mockito.verify(creator, Mockito.times(1)).createFullPerson(name, jobTitle, age);
	}
	
}

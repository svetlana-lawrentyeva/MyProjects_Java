package com.example.dao_person;

import java.util.List;

public interface DAO_Person
{
	public void update(Person p);
	public void delete(int id);
	public void delete(Person p);
	public void create(Person p);
	public void creatr(List<Person> pList);
	public Person read(int id);
	public List<Person> read();
}

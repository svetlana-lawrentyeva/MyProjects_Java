package com.example.persondb;

import java.util.List;

public interface IDS 
{
	public void update(Person p);
	public void delete(int id);
	public void delete(Person p);
	public void create(Person p);
	public void create(List<Person> pList);
	public Person read(int id);
	public List<Person> read();
}

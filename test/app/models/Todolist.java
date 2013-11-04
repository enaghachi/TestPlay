package models;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

public class Todolist extends Model{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public int num;
	public String label;
	public Date date_inscription;
	
	
	public static Finder<String, Todolist> find = new Finder<String, Todolist>(String.class, Todolist.class);
	
	public static List<Todolist> findall(){
		return find.all();
	}
	
}

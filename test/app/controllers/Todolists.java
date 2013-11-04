package controllers;

import java.util.Date;

import models.Todolist;
import models.Tweet;
import models.Utilisateur;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Todolists extends Controller {
	 public static Result add() {

       Form<Todolist> TodoForm = Form.form(Todolist.class).bindFromRequest();//permet de récupérer les informations en provenance d'un POST à partir d'un formulaire html (<form></form>)     
       	Todolist todolist = TodoForm.get();//permet de créer une instance de utilisateur avec les informations en provenance du formulaire
       	
       	todolist.date_inscription = new Date();
       	todolist.save();//permet d'ajouter le Usermark en base
       	return redirect(routes.Application.index());
     }

}


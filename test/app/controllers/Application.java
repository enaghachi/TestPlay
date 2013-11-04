package controllers;

import models.Todolist;
import models.Utilisateur;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("To do list",
        		Todolist.findall()
        		));
    }

}

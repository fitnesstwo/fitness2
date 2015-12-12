package controllers;

import play.*;
import play.mvc.*;
import com.avaje.ebean.Model;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        return redirect(routes.Application.index()); //ok(index.render("Your new application is ready."));
    }

}

import spark.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());

        get("/UserForm", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "UserForm.hbs");
        }, new HandlebarsTemplateEngine());

        get("/user", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<User> hero = User.getAllInstances();
            model.put("user", hero);
            return new ModelAndView(model, "UserForm.hbs");
        }, new HandlebarsTemplateEngine());
    }
}

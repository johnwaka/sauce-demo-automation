package swaglab.tasks.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;

public class Navigate {
    public static Performable toTheCatalogPage() {
        return Open.url("https://www.saucedemo.com/inventory.html");
    }

    public static Performable toTheLoginPage() {
        return Open.url("https://www.saucedemo.com/");
    }
}

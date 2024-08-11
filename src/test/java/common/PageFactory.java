package common;

import pages.ElementsPage;
import pages.WebTablePage;

public class PageFactory {
    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/");
    }

    public static WebTablePage buildWebTablePage() {
        return new WebTablePage("/");
    }
}

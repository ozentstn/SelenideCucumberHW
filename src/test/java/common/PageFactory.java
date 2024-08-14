package common;

import pages.ElementsPage;
import pages.WebTablePage;

public class PageFactory {
    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }

    public static WebTablePage buildWebTablePage() {
        return new WebTablePage("/webtables");
    }
}

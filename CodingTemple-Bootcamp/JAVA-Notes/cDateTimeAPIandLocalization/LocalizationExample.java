package cDateTimeAPIandLocalization;
import java.util.Locale;
import java.util.ResourceBundle;
public class LocalizationExample {
    public static void main(String[] args) {
        Locale locale = Locale.FRENCH;

        ResourceBundle messages = ResourceBundle.getBundle("JavaAdvancedDateTimeAPIandLocalization.messages", locale);

        System.out.println(messages.getString("greeting"));
        System.out.println(messages.getString("farewell"));
    }
}

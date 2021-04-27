package co.com.choucair.certification.firstproject.userinterface;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_UC = Target.the("Selecciona la Universidad choucair")
            .located( By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para ingresar al curso")
            .located(By.xpath("//h4[@class='result-title']//a[contains(text(),'Foundation Level')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h3[@class='coursename']//a[contains(text(),'Foundation Level')]"));

}

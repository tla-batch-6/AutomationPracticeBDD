package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Temp {

    public static void main(String[] args) {


        //select class (by index, by text, by value)
        select("Orange", "Visible text");
    }

    public static void selectByVisibleText(By by, String whatToSelect){
        //select by visible text implementation
    }

    public static void selectByIndex(WebElement element, String whatToSelect){
        //select by visible text implementation
        Select select = new Select(element);
    }

    public static void select(String whatToSelect, String type){
        switch (type){
            case "index": //select whatToSelect by index
                break;
            case "visible text": //select whatToSelect by visible text
                break;
            case "value": //select whatToSelect by value
                break;
        }
    }

}

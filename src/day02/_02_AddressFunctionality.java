package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.Tools;

import java.util.List;

public class _02_AddressFunctionality extends BaseDriver {

    /**
     Scenario;
     1- Open the site.
     2- Add an address.
     3- Edit the last address by changing the first and last name, then save it.
     4- Delete the last address.
     */

    @Test
    void addAddress(){
        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAddress = driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Kerem");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Said");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");

        WebElement address1 = driver.findElement(By.id("input-address-1"));
        address1.sendKeys("21a London Road");

        WebElement address2 = driver.findElement(By.id("input-address-2"));
        address2.sendKeys("RG2 5BJ");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Reading");

        WebElement postCode = driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        WebElement webCountry = driver.findElement(By.id("input-country"));
        Select country = new Select(webCountry);
        country.selectByVisibleText("Turkey");

        // wait.until(ExpectedConditions.elementToBeClickable(webCountry)); // wait until the country is clickable again

        WebElement webState = driver.findElement(By.id("input-zone"));
        Select state = new Select(webState);
        state.selectByVisibleText("Ankara"); // Select the option that appears as 'Ankara'
        // state.selectByIndex(2); this line would work with an implicit wait

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"addAddress"})
    void editAddress() {
        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll = driver.findElements(By.linkText("Edit")); // all edit buttons
        WebElement lastEdit = editAll.get(editAll.size() - 1); // the last edit button
        lastEdit.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Said");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Kerem");

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress() {
        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteAll = driver.findElements(By.linkText("Delete")); // all delete buttons
        WebElement lastDelete = deleteAll.get(deleteAll.size() - 1); // the last delete button
        lastDelete.click();

        Tools.successMessageValidation();
    }
}

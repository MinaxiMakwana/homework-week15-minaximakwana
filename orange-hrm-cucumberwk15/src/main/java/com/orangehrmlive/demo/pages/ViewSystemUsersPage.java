package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * 5.ViewSystemUsersPage - System Users Text, Username Field, User Roll dropDown,
 * Employee Name Field,
 * Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and
 * it's actions
 */
public class ViewSystemUsersPage extends Utility {

    //Elements
    @CacheLookup
    @FindBy(xpath = "//h5[text()='System Users']")
    static WebElement systemUserHeading;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
    WebElement userNameInputTextBoxes;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    static WebElement userName;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    static WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    static WebElement typeForHints;
    @CacheLookup
    @FindBy(xpath = "//div[@role='option']/span")
    static WebElement autoCompleteHint;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
    static WebElement userStatusDropDown;
    @CacheLookup
    @FindAll
            ({@FindBy(xpath = "//div[@role='option']")})
    static List<WebElement> userRoleOptions;

    @CacheLookup
    @FindAll
            ({@FindBy(xpath = "//div[@role='option']")})
    static List<WebElement> userStatusOptions;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    static WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//div/span[contains(normalize-space(),'Record Found')]")
    static WebElement recordFoundLabel;
    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
    WebElement userNameCheckBox;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteIcon;
    @CacheLookup
    @FindBy(xpath = "(//button[contains(@class,'oxd-button oxd-button--medium')]/child::i)[3]")
    WebElement confirmDeletePopUpButton;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]")
    static WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//span[text()='(1) Record Found'] ")
    WebElement recordsFoundToasterMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[2]//div[1]")
    static WebElement userNameInRecord;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;




    //Methods
    public static String getSystemUserHeadingText() {
        return getTextFromElement(systemUserHeading);
    }

    public void clickOnAddUserButton() {
        clickOnElement(addButton);
    }

    public void enterUserName(String name) {
        sendTextToElement(userName, name);
    }

    public void clickOnUserRoleDropDown() {
        clickOnElement(userRoleDropDown);
    }

    public static void selectUserRoleFromDropDown(String role) {
        for (WebElement option : userRoleOptions) {
            if (option.getText().equals(role)) {
                option.click();
                break;
            }
        }
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
    }

    public void clickOnStatusDropDown() {
        clickOnElement(userStatusDropDown);
    }

    public static void selectUserStatusFromDropDown(String status) {
        for (WebElement option : userStatusOptions) {
            if (option.getText().equals(status)) {
                option.click();
                break;
            }
        }
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public static String getRecordFoundLabelText() {
        return getTextFromElement(recordFoundLabel);
    }

    public void searchUser(String name, String role, String status) {
        sendTextToElement(userName, name);
        clickOnElement(userRoleDropDown);
        selectUserRoleFromDropDown(role);
        clickOnElement(userStatusDropDown);
        selectUserStatusFromDropDown(status);
        clickOnElement(searchButton);

    }

    //Overridden method
    public static void searchUser(String name, String role, String employeename, String status) {
        sendTextToElement(userName, name);
        clickOnElement(userRoleDropDown);
        selectUserRoleFromDropDown(role);
        clickOnElement(employeeName);
        sendTextToElement(typeForHints, employeename);
        clickOnElement(autoCompleteHint);
        clickOnElement(userStatusDropDown);
        selectUserStatusFromDropDown(status);
        clickOnElement(searchButton);

    }

    public String getRecordFoundToasterMessageText(){
        return getTextFromElement(recordsFoundToasterMessage);
    }

    public void clickOnUserNameCheckBox() {
        clickOnElement(userNameCheckBox);
    }

    public void clickOnDeleteIcon() {
        clickOnElement(deleteIcon);
    }

    public void clickOnConfirmDeleteButton() {
        //switchToAlert();
        clickOnElement(confirmDeletePopUpButton);
    }

    public static String getUserNameInRecordText(){
        return getTextFromElement(userNameInRecord);
    }
    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }

}

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Adactin.feature");
formatter.feature({
  "name": "To validate registeration form in the Adactin Hotel room booking",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Registeration Form by giving different set of details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should give valid username and valid password and enter login button",
  "rows": [
    {
      "cells": [
        "username",
        "jamespraveen91"
      ]
    },
    {
      "cells": [
        "password",
        "jamesrajan"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_should_give_valid_username_and_valid_password_and_enter_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in valid Search Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_valid_Search_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the location,Hotels, Room Type,No of rooms,Check in date,Check out date,Adults per room, Children per room, from the drop down and click search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_select_the_location_Hotels_Room_Type_No_of_rooms_Check_in_date_Check_out_date_Adults_per_room_Children_per_room_from_the_drop_down_and_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in valid select hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_valid_select_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the radio button and then click continue button for the selected Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_select_the_radio_button_and_then_click_continue_button_for_the_selected_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in valid Book a Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_valid_Book_a_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter first name, last name,billing address,Sixteen digits credit card number,credit card type,the Expiry month and year,valid cvv number, and click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_enter_first_name_last_name_billing_address_Sixteen_digits_credit_card_number_credit_card_type_the_Expiry_month_and_year_valid_cvv_number_and_click_the_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in valid Booking confimation page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_valid_Booking_confimation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get the Order ID for the room booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_get_the_Order_ID_for_the_room_booking()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"order_n\"}\n  (Session info: chrome\u003d91.0.4472.114)\n  (Driver info: chromedriver\u003d91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.07 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-J1SG6LE\u0027, ip: \u0027192.168.43.128\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50539}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}), userDataDir\u003dC:\\Users\\ADMIN\\AppData\\Local\\Temp\\scoped_dir7176_163285819}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d91.0.4472.114, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 641f77e66a2094d53ea559c3bf3e10f2\n*** Element info: {Using\u003did, value\u003dorder_n}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getAttribute(Unknown Source)\r\n\tat org.baseclasswork.Baseclasswork.getvalue(Baseclasswork.java:81)\r\n\tat org.stepdefinition.Stepdefinition.user_should_get_the_Order_ID_for_the_room_booking(Stepdefinition.java:118)\r\n\tat ✽.User should get the Order ID for the room booking(file:src/test/resources/Featurefiles/Adactin.feature:17)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});
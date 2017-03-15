$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("alogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Cyclops",
  "description": "I want to test the login to Cyclops",
  "id": "login-to-cyclops",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Cyclops\u0027 Login",
  "description": "",
  "id": "login-to-cyclops;cyclops\u0027-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have the permission to Cyclops as an Agent through Phalanx",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to cyclops\u0027 login url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to view Cyclops\u0027 Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginTest.valid_agent_id()"
});
formatter.result({
  "duration": 11250980608,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.login_url()"
});
formatter.result({
  "duration": 466899425,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.cyclops_home()"
});
formatter.result({
  "duration": 10131154847,
  "status": "passed"
});
formatter.uri("homepageSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel Search from Home Page",
  "description": "I want to test hotel search for a location",
  "id": "hotel-search-from-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Home Page Search for Hotel using Address",
  "description": "",
  "id": "hotel-search-from-home-page;home-page-search-for-hotel-using-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am logged in to Cyclops",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "present on the Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter the Search criteria",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on Search Hotel button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should navigate to the Search Results Page",
  "keyword": "Then "
});
formatter.match({
  "location": "homeAddressSearch.cyclops_login()"
});
formatter.result({
  "duration": 13354119860,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.validateHomePage()"
});
formatter.result({
  "duration": 444741,
  "error_message": "java.lang.NullPointerException\r\n\tat pageObjects.homePage.drp_country(homePage.java:33)\r\n\tat step_definition.homeAddressSearch.validateHomePage(homeAddressSearch.java:35)\r\n\tat ✽.And present on the Home Page(homepageSearch.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "homeAddressSearch.fillAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homeAddressSearch.clickSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homeAddressSearch.cyclopsSearchResults()"
});
formatter.result({
  "status": "skipped"
});
});
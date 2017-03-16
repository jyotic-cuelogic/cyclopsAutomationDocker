$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepageSearch.feature");
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
  "duration": 18921451523,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.validateHomePage()"
});
formatter.result({
  "duration": 719311603,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.fillAddress()"
});
formatter.result({
  "duration": 3344782158,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.clickSearch()"
});
formatter.result({
  "duration": 155358265907,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.cyclopsSearchResults()"
});
formatter.result({
  "duration": 13529467,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Home Page Search for Hotel using City",
  "description": "",
  "id": "hotel-search-from-home-page;home-page-search-for-hotel-using-city",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am logged in to Cyclops",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "present on the Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter the Search criteria for City",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "click on Search Hotel button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should navigate to the Search Results Page",
  "keyword": "Then "
});
formatter.match({
  "location": "homeAddressSearch.cyclops_login()"
});
formatter.result({
  "duration": 17116596877,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.validateHomePage()"
});
formatter.result({
  "duration": 5560200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.uri("login.feature");
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
  "duration": 12200301554,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.login_url()"
});
formatter.result({
  "duration": 714055258,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.cyclops_home()"
});
formatter.result({
  "duration": 12908184858,
  "status": "passed"
});
});
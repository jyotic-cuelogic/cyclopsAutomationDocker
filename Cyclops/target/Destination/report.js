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
  "duration": 38008877408,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.validateHomePage()"
});
formatter.result({
  "duration": 5804650,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.fillAddress()"
});
formatter.result({
  "duration": 642082533,
  "status": "passed"
});
formatter.match({
  "location": "homeAddressSearch.clickSearch()"
});

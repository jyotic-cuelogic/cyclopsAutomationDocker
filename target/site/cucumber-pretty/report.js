$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Cyclops",
  "description": "I want to test the login to Cyclops",
  "id": "login-to-cyclops",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
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
  "duration": 26589815720,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.login_url()"
});
formatter.result({
  "duration": 783094745,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.cyclops_home()"
});
formatter.result({
  "duration": 6280892663,
  "status": "passed"
});
});
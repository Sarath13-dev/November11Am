$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RAM SARATH KUMAR/eclipse-workspace/Cucumber6PmDecember/src/test/resources/Features/FacebookLogin.feature");
formatter.feature({
  "name": "Validation of Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validation of Facebook with correct Username and correct password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be launch in Facebook page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User checks that logeed into home page or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ramsss",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of Facebook with correct Username and correct password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be launch in Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_be_launch_in_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"ramsss\" and \"12345\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User checks that logeed into home page or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_checks_that_logeed_into_home_page_or_not()"
});
formatter.result({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sambath/eclipse-workspace/cucumber1/src/test/resources/Feature/Add customer otline.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user is filling the details\"\u003cmth Rent\u003e\",\"\u003cfreeloc\u003e\",\"\u003cfree inter\u003e\",\"\u003cfree SMS\u003e\",\"\u003cloc char\u003e\",\"\u003cInter Char\u003e\",\"\u003csms char\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click for Submit button",
  "keyword": "And "
});
formatter.step({
  "name": "Display confirmation pages",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mth Rent",
        "freeloc",
        "free inter",
        "free SMS",
        "loc char",
        "Inter Char",
        "sms char"
      ]
    },
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "700"
      ]
    },
    {
      "cells": [
        "200",
        "300",
        "400",
        "500",
        "600",
        "700",
        "800"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The user is on telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTraiffOutline.the_user_is_on_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click add for traiff plans",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffOutline.the_user_click_add_for_traiff_plans()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tag2"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user is filling the details\"100\",\"200\",\"300\",\"400\",\"500\",\"600\",\"700\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTraiffOutline.the_user_is_filling_the_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click for Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffOutline.click_for_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Display confirmation pages",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraiffOutline.display_confirmation_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The user is on telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTraiffOutline.the_user_is_on_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click add for traiff plans",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffOutline.the_user_click_add_for_traiff_plans()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tag2"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user is filling the details\"200\",\"300\",\"400\",\"500\",\"600\",\"700\",\"800\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTraiffOutline.the_user_is_filling_the_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click for Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffOutline.click_for_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Display confirmation pages",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraiffOutline.display_confirmation_pages()"
});
formatter.result({
  "status": "passed"
});
});
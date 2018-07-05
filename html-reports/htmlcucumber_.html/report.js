$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample1.feature");
formatter.feature({
  "line": 2,
  "name": "Hello World program",
  "description": "",
  "id": "hello-world-program",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "duration": 286585,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I installed eclipse",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I install eclipse",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefintion1.i_install_eclipse()"
});
formatter.result({
  "duration": 602260881,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#Scenario: I used to print hello world program"
    },
    {
      "line": 8,
      "value": "#Given I logged in to eclipse"
    },
    {
      "line": 9,
      "value": "#When I write program to print hello world"
    },
    {
      "line": 10,
      "value": "#Then I verify hello world is print"
    },
    {
      "line": 12,
      "value": "#Scenario: I used to print second hello world program"
    },
    {
      "line": 13,
      "value": "#Given I logged in to eclipse"
    },
    {
      "line": 14,
      "value": "#When I write program to print hello world"
    },
    {
      "line": 15,
      "value": "#Then I verify hello world is print"
    },
    {
      "line": 17,
      "value": "#@hellow"
    },
    {
      "line": 18,
      "value": "#Scenario Outline: I want to print Hello and Hi in my program"
    },
    {
      "line": 19,
      "value": "#Given I logged in to eclipse"
    },
    {
      "line": 20,
      "value": "#When I write program with \u0027\u003cUserName\u003e\u0027"
    },
    {
      "line": 21,
      "value": "#And I write program with \u0027\u003cPassword\u003e\u0027"
    },
    {
      "line": 22,
      "value": "#And I write program with \u0027\u003cLogin\u003e\u0027"
    },
    {
      "line": 23,
      "value": "#Then I verify program with \u0027\u003cUserName\u003e\u0027"
    },
    {
      "line": 24,
      "value": "#And I verify program with \u0027\u003cPassword\u003e\u0027"
    },
    {
      "line": 25,
      "value": "#And I verify program with \u0027\u003cLogin\u003e\u0027"
    },
    {
      "line": 26,
      "value": "#Examples:"
    },
    {
      "line": 27,
      "value": "#|UserName|Password|Login|"
    },
    {
      "line": 28,
      "value": "#|Test1|Pass1|login1|"
    },
    {
      "line": 29,
      "value": "#|Test2|Pass2|login2|"
    }
  ],
  "line": 32,
  "name": "I want to print hello world using step arguments",
  "description": "",
  "id": "hello-world-program;i-want-to-print-hello-world-using-step-arguments",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@StepArgument"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User will launch chrome browser and launch google portal",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User will Enter number 100",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User will Clear search text field",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Usewr will enter \"Wipro Technologies\" in Search Text field",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepDefinitions.user_will_launch_chrome_browser_and_launch_google_portal()"
});
formatter.result({
  "duration": 37142770245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 23
    }
  ],
  "location": "GoogleStepDefinitions.user_will_Enter_number(int)"
});
formatter.result({
  "duration": 6152469929,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefinitions.user_will_Clear_search_text_field()"
});
formatter.result({
  "duration": 6058002890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wipro Technologies",
      "offset": 18
    }
  ],
  "location": "GoogleStepDefinitions.usewr_will_enter_in_Search_Text_field(String)"
});
formatter.result({
  "duration": 129801841,
  "status": "passed"
});
formatter.after({
  "duration": 43799,
  "status": "passed"
});
});
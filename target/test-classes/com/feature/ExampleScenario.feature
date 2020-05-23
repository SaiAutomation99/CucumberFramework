@ExampleScenario
Feature: Example scenario
@Example
Scenario Outline: example

Given user logined page<"url">
Then clicked on <"save"> button

Examples:
|url|save|
|facebook|button|
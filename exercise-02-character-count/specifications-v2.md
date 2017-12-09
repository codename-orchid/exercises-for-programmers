# Exercise 02: character-count
##### Version 2

## Specifications

### Input(s)
+ string

### Process(es)
+ count the number of characters in the string

### Output(s)
+ string
+ number of characters in string

## Test plans

### Test 1
#### Input(s):
`string: apple`

#### Expected result:
`apple has 5 characters.`

### Test 2
#### Input(s):
`string:`

#### Expected result:
`Please enter a string.`

## Challenge
+ Catch empty string input

## Algorithm
```
character-count
  Initialise string to ''

  Prompt for string with 'What is the input string? '

  Count the number of characters in string

  Loop while number of characters is zero:
    Display 'Please enter a string.'
    Prompt for string with 'What is the input string? '

  Display string with the number of characters
End
```
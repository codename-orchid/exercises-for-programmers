# Exercise 02: character-count
##### Version 1

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
`string: orange`

#### Expected result:
`orange has 6 characters.`

## Constraint(s)
+ Use built-in string length function
+ Construct the output in a single output statement

## Algorithm
```
character-count
  Initialise string to ''

  Prompt for string with 'What is the input string? '

  Count the number of characters in string

  Display string with the number of characters
End
```
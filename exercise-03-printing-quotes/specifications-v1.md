# Exercise 03: printing-quotes
##### Version 1

## Specifications

### Input(s)
+ quote
+ author

### Process(es)
n/a

### Output(s)
+ string containing author and quote

## Test plans

### Test 1
#### Input(s):
`quote: Talk is cheap. Show me the code.`
`author: Linus Torvalds`

#### Expected result:
`Linus Torvalds says, "Talk is cheap. Show me the code."`

### Test 2
#### Input(s):
`quote: Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.`
`author: John F. Woods`

#### Expected result:
`John F. Woods says, "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live."`

## Constraint(s)
+ Use string concatenation
+ Use a single output statement

## Algorithm
```
print-quotes
  Initialise quote to ''
  Initialise author to ''

  Prompt for quote with 'What is the quote? '
  Prompt for author with 'Who said it? '

  Concatenate the output components

  Display output in the form of 'author says, "quote"'
End
```
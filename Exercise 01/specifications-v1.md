# Title: saying-hello

#### Version: 1

# Specifications

## Input(s)
+ name

## Process(es)
n/a

## Output(s)
+ greeting with name

# Test plans

## Test 1
### Input(s):
> `name: Cattleya`

### Expected result:
> `greeting: Hello, Cattleya, nice to meet you!`

## Test 2
### Input(s):
> `name: RM`

### Expected result:
> `greeting: Hello, RM, nice to meet you!`

# Constraint(s)
Keep input, concatenation and output separate

# Algorithm
```
saying-hello
  Initialise name to ''
  Initialise hello to 'Hello, '
  Initialise nice to ', nice to meet you!'
  Initialise greeting to ''

  Prompt for name with 'What is your name? '

  greeting = hello + name + nice

  Display greeting
End
```
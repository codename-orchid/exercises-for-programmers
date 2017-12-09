# Exercises for programmers, exercise 02: Character count
# Version 2
# codename-orchid

prompt = 'What is the input string? '
string = input(prompt)
while len(string) == 0:
    print('Please enter a string.\n')
    string = input(prompt)
print(string, 'has', len(string), 'characters.')

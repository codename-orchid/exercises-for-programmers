/*
 * Exercises for programmers, exercise 03: Printing quotes
 * Version 1
 * codename-orchid
 * reference: https://nodejs.org/api/readline.html
 */

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('What is the quote? ', quote => {
  rl.question('Who said it? ', author => {
    console.log(author + ' says, \"' + quote + '\"');
    rl.close();
  });
});
/*
 * Exercises for programmers, exercise 01: Saying hello
 * Version 2
 * codename-orchid
 * reference: https://nodejs.org/api/readline.html
 */

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('What is your name? ', name => {
  console.log('Hello, ' + name + ', nice to meet you!');
  rl.close();
})
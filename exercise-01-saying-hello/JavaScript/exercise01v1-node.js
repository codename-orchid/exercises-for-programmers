/*
 * Exercises for programmers, exercise 01: Saying hello
 * Version 1
 * codename-orchid
 * Reference: https://nodejs.org/api/readline.html
 */

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('What is your name? ', (name) => {
  const hello = 'Hello, ';
  const nice = ', nice to meet you!';
  console.log(hello + name + nice);
  rl.close();
})
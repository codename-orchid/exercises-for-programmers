/*
 * Exercises for programmers, exercise 02: Character count
 * Version 1
 * codename-orchid
 * reference: https://nodejs.org/api/readline.html
 */

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('What is the input string? ', string => {
  console.log(string + ' has ' + string.length + ' characters.');
  rl.close();
})
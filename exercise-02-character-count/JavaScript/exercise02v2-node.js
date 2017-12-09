/*
 * Exercises for programmers, exercise 02: Character count
 * Version 2
 * codename-orchid
 * reference: https://stackoverflow.com/questions/24464404/how-to-readline-infinitely-in-node-js?answertab=votes#tab-top
 */

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const getString = function() {
  rl.question('What is the input string? ', answer => {
    if(answer.length > 0) {
      console.log(answer + ' has ' + answer.length + ' characters.');
      return rl.close();
    };
    console.log('Please enter a string.\n');
    getString();
  })
}

getString();
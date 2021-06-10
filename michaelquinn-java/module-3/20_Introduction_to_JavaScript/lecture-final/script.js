/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const myConst = 'I am constant';
  printParameters('Hi', myConst);

  // This will break
  // myConst = 'Bye';

  // Declares a variable those value can be changed
  let myName = 'Yoav';
  printParameters('Hi', myName);
  myName = 'Not Yoav';
  printParameters('Hi', myName);

  let myNum = 5;
  let myNum2 = 6;
  // prints value of expression
  console.log(myNum + myNum2);

  myNum2 = 'A';
  // multiplying with a letter will yield NaN
  console.log(myNum * myNum2);

  // You can check for this using isNaN...
  console.log('isNaN(myNum * myNum2): ' + isNaN(myNum * myNum2));
  console.log('isNaN(5 * 6): ' + isNaN(5 * 6));

  // variables which have not been assigned a value are 'undefined'
  let myUndefVariable;

  console.log('myUndefVariable: ' + myUndefVariable);

  //  you can check for this value (note that the condition is
  // enclosed in parentheses... if it isn't it won't evaluate correctly
  // because of the + )
  console.log('myUndefVariable == undefined: ' + (myUndefVariable == undefined));


  // null is a value that can be assigned. it indicates empty or
  // no content but it IS a value so the variable will be equal to null
  // not undefined
  myUndefVariable = null;
  console.log('myUndefVariable: ' + myUndefVariable);

}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

// logical branching
function testValue (value) {
  if (value === 1) {
    console.log('is num 1');
  } else if (value == 1) {
    console.log('evaluates to 1');
  } else {
    console.log('does not evaluate to 1');
  }

  switch (value) {
    case 1: 
      console.log('is num 1');
      // needed to prevent "falling through" to next case
      break;
    case '1':
      console.log('evaluates to 1');
      break;
    default:
      console.log('does not evaluate to 1');
      break;
  }
}

// loops work as in Java
function loops(limit) {
  for(let i = 0; i <= limit; i++) {
    console.log('i:' + i);
  }

  let num = 10;
  while(num > 0 ) {
    if (num != 5) {
      console.log('num' + num);
    }
    num--;
  }

  let num2 = 0;
  do {
    console.log('num2: ' + num2);
  } while (num2 > 0);
}

// interpolation... using tick ` content in ${} will be evaluated as an expression
function interpolate(value) {
  const text = `value is ${value}`;
  console.log('text: '  + text);
  console.log(`more text: ${value}xxxxx`);
}

//declaring arrays
function showArrays() {
  let myArray1 = [];
  let myArray2 = ['A', 'B', 'C'];

  console.log('myArray1.length: ' + myArray1.length);
  console.log(`myArray2.length: ${myArray2.length}`);

  console.log(`myArray2[2]: ${myArray2[2]}`);
}

// manipulating array...
function changeArrays() {
  let myArray = ['Hi', 'there'];

  console.log('start...')
  dumpArray(myArray);

  // push an item to end of array
  myArray.push('blah');


  myArray.push('monday');
  myArray.push('happy');

  
  console.log('after push...')
  dumpArray(myArray);


  // can pop - least element of array will be removed
  myArray.pop();
  console.log('after pop...')
  dumpArray(myArray);


  // pop returns the element that was remove. You
  // can caoture it.
  const popValue = myArray.pop();
  console.log('after pop2...')
  console.log(`${popValue} was popped`);
  dumpArray(myArray);

  // shift works like pop, but removes first element
  const shiftValue = myArray.shift();
  console.log(`shift value: ${shiftValue}`);
  dumpArray(myArray);

  // unshift: insert at first element
  myArray.unshift('hello again');
  console.log('after unshift...')
  dumpArray(myArray);

  // indexOf and lastIndexOf work as in Strings in Java
  console.log("myArray.indexOf('there'):" + myArray.indexOf('there'));

  myArray.push('there');

  dumpArray(myArray);
  console.log("after push of there: array.indexOf('there'):" + myArray.indexOf('there'));

  console.log("after push of there: array.lastIndexOf('there'):" + myArray.lastIndexOf('there'));

  console.log("myArray.indexOf('ugh'): " + myArray.indexOf('ugh'));

  // you can use includes to check if an element is included
  // in array
  console.log(`myArray includes 'hello again': ${myArray.includes('hello again')}`)
  console.log(`myArray includes 'goodbye again': ${myArray.includes('goodbye again')}`)


}

function dumpArray(data) {
  for (let i = 0; i < data.length; i++) {
    console.log(data[i]);
  }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ]
  };

  // Log the object
  console.log(person);

  // Log the first and last name
  console.log(person.firstName + ' ' + person.lastName);

  // Log each employee
  for (let i = 0; i < person.employees.length; i++) {
    console.log(person.employees[i]);
  }

  console.log('person.mom: ' + person.mom);
}

function sumVals(val1, val2) {
  return val1 + val2;
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) {
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}

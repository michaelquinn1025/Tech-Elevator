/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter) {
  return firstParameter * secondParameter;
}


/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyTogether(firstParameter = 0, secondParameter = 0) {
  if (isNaN(Number.parseInt(firstParameter)) || isNaN(Number.parseInt(secondParameter))) {
    return 0;
  }
  return firstParameter * secondParameter;
}


 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block

    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}


function shadowTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block

    // We are REDEFIINING inScopeInScopeTest.
    //
    // this versoion lives inside this block and doesn't
    // exist outside of the block
    let inScopeInScopeTest = false;
    inScopeInScopeTest = 'blah';

    // this will print the value defined above
    console.log('in block: ' + inScopeInScopeTest)
  }
  
  // when we are out of the block, the variable in the block\
  // is popped off the stack and has the original meaning
  console.log('out of block: ' + inScopeInScopeTest);
}

/**
 * Write a function concatAll that returns a string of all
 * arguements separated by spaces
 */
function concatAll() {
  for (let i = 0; i < arguments.length; i++) {
    console.log(arguments[i])
  }
}

/**
 * desc
 * @param {string} text 
 */
function printMyText(text) {
  if (arguments.length > 0 && arguments[1] === 'lowercase') {
    console.log(text.toLowerCase());
  } else {
    console.log(text);
  }
}


/**
 * desc
 * @param {*} text 
 */
function myDummyString(text) {
  console.log(text);
}


// generate JSDoc 
/**
 * This is a description
 * @param {string} name 
 * @param {number} age 
 * @param {string[]} listOfQuirks 
 * @param {string} separator 
 * @returns
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}


function showAnonymousFuncAsVariable(val1, val2) {
  // define anonymous function (num1, num2) => { return num1 + num2 }
  // and store it in a variable called sumNums
  let sumNums = (num1, num2) => { return num1 + num2 };

  // we can now refer to the anonymous function via
  // the variable it was assigned to and use it
  // like any other function
  console.log(sumNums(5, 9));

  // we can even assign it to another variable and it will have the
  // same meaning
  sumNums2 = sumNums;
  console.log(sumNums2(5, 9));

  // we can use with params passed in
  console.log(sumNums(val1, val2));

  // we can define a new anonymous function that uses
  // the original function via the variable it was assigned to
  // and assign it to its own variable
  let sumNums3 = (param) => { return sumNums(param, 5) };
  console.log(sumNums3(50));


  // we can combine calls to different anonymous functions
  // that were assigned to variable names like we would
  // any other function
  console.log(sumNums3(sumNums(20, 30)));

}
/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  let sumNums = (num1, num2) => { return num1 + num2 };


  // can define a different version that multiplies instead
  let multNums = (val1, val2) => { return val1 * val2 };

  // use the add function
  console.log(numbersToSum.reduce(sumNums));

  // use the multiply function
  console.log(numbersToSum.reduce(multNums));

}

function sumAllNumsNoVariable(numbersToSum) {
  
  // same as above but anonymous functions are passed
  // in directly - wihtout being assigned to a varuable


  console.log(numbersToSum.reduce( 
      (num1, num2) => {
        return num1 + num2
  } ));

  console.log(numbersToSum.reduce( 
    (num1, num2) => {
      return num1 * num2
} ));
}
/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {

  let result = numbersToFilter.filter( (element) => {
    return element % 3 === 0
  });

  console.log(result);


  // do this with divisible by 2 instead of 3
  let resultDiv2 = numbersToFilter.filter( (myNum) => {
    return myNum % 2 === 0
  });

  console.log(resultDiv2);
}

/**
 * Takes an array and uses map to return an array
 * containing each original element increased by three.
 * 
 * @param {number[]}} nums 
 * @returns {number[]} a new array with original numbers incremented by three.
 */
function addThreeToAll(nums) {
  let result = nums.map( (element) => {
    return element + 3;
  })

  console.log(result);
}


/**
 * Takes an array and outputs each element
 * 
 * @param {any[]} array 
 */
function dumpArray(myArray) {

  // do something for each array element
  myArray.forEach( (element) => {
    console.log(element);
  })

  const suffix = " there";

  // anonymous functions can access variables defined outside
  // them (suffix in this case)
  myArray.forEach( (element) => {
    console.log(element + suffix);
  })
}


function doSum(num1, num2) {
  return num1 + num2;
}

// methods like reduce, filter,  etc. that
// take functions can use functions defined elsewhere
// as here. It's not required to define an
// anonymous function - we just do if we haven't
// defined a function external to 
// the current function that we can use (doSum in this case)
function doSumAgain(numArray) {
  console.log(numArray.reduce(doSum));
}
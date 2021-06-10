// add pageTitle
const pageTitle = 'My Shopping List';
const groceries = [
  "item 1",
  "item 2",
  "item 3",
  "item 4",
  "item 5",
  "item 6",
  "item 7",
  "item 8",
  "item 9",
  "item 10"
]


// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}


function displayGroceries() {
  const theList = document.getElementById('groceries');
  groceries.forEach( (item) => {
    const newListItem = document.createElement('li');
    newListItem.innerText = item;
    theList.appendChild(newListItem);
    
  })
}


function markCompleted() {
  const theList = document.getElementById('groceries');
  const items = theList.querySelectorAll('li');
  items.forEach( (item) => {
  item.classList.add('completed');
})
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});

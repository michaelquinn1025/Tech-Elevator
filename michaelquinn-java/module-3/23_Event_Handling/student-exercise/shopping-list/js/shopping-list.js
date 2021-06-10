let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

let listItems;
let btnMarkComplete;

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

function markComplete(listItem, isComplete) {

  const icon = listItem.querySelector('i');

  if (isComplete && !listItem.classList.contains('completed')) {
    listItem.classList.add('completed');
    icon.classList.add('completed');
  } else if(!isComplete && listItem.classList.contains('completed')){
    listItem.classList.remove('completed');
    icon.classList.remove('completed');
  }
}

function toggleAll() {
  const isMarkComplete = allItemsIncomplete;
  const message = isMarkComplete ? 'Mark All Incomplete' : 'Mark All Complete';

  //if (allItemsIncomplete) {
    //listItems.forEach( (item) => {
      //markComplete(item, true);
     //btnMarkComplete.innerText = 'Mark All Incomplete'
    //});
  //}
 listItems.forEach( (item) => {
   markComplete(item, isMarkComplete);
   btnMarkComplete.innerText = message;
 });

 allItemsIncomplete = !allItemsIncomplete;

}

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();

  listItems = document.querySelectorAll('li');
  listItems.forEach( (item) => {
      item.addEventListener('click', (event) => {
        markComplete(event.target, true);
      })

      item.addEventListener('dblclick', (event) => {
        markComplete(event.target, false);
      })
  });

  btnMarkComplete = document.getElementById('toggleAll');
  btnMarkComplete.addEventListener('click', () => {
    toggleAll();

  })

});




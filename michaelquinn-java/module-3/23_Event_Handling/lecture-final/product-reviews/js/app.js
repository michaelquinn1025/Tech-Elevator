const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

/**
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerText = review.reviewer;
  tmpl.querySelector('h3').innerText = review.title;
  tmpl.querySelector('p').innerText = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();
    tmpl.querySelector('.rating').appendChild(img);
  }
  main.appendChild(tmpl);
}

// LECTURE STARTS HERE ---------------------------------------------------------------

// wait for DOM Content to be ready before we manipulate it
document.addEventListener('DOMContentLoaded', () => {
  console.log("DOM is Ready!");
  // set the product reviews page title
  setPageTitle();
  // // set the product reviews page description
  setPageDescription();
  // // display all of the product reviews on our page
  displayReviews();

  // add a  click even to the description <p> so it will toggle to
  // the input field when clicked
  const desc = document.querySelector('.description');
  desc.addEventListener('click', (event) => {
    // method needs the element so we pass event.target
    // which contains element that triggered the event
    toggleDescriptionEdit(event.target);
  });

  // add a keyup event to the text field. 
  // check for key value: 
  //  1) If Enter key: call the exit method to hide
  //      the text box and update the contents of the
  //      <p> element before showing it again
  //  2) If Escape key. call the same method but
  //      pass false as the param to indicate <p> should
  //      not be updated
  const inputDesc = document.getElementById('inputDesc');
  inputDesc.addEventListener('keyup', (event) => {
      if (event.key === 'Enter') {
        exitDescriptionEdit(event.target, true);
      } else if (event.key === 'Escape') {
        exitDescriptionEdit(event.target, false);
      }
  });

  // add the same behavior as pushing escape if the mouse leaves the text box
  // (probably not really desireable behavior)
  inputDesc.addEventListener('mouseleave', (event) => {
      exitDescriptionEdit(event.target, false);
  });
  
  // this is a more reasonable version.... 
  // Escape funtionality will be called if
  // the field loses focus by someone clicking outside
  // of it (blur)
  inputDesc.addEventListener('blur', (event) => {
    exitDescriptionEdit(event.target, false);
  });

  // add click listener to Add Review button to toggle
  // for show/hhde
  const btnToggleForm = document.getElementById('btnToggleForm');
  btnToggleForm.addEventListener('click', () => {
    showHideForm();
  });


  // add click listener to save data when Save button clicked/
  // button is a Submit button so we prevent the default
  // behavior of Submit before calling our save code
  const btnSaveReview = document.getElementById('btnSaveReview');
  btnSaveReview.addEventListener('click', (event) => {
    event.preventDefault();
    saveReview();
  })
  
  
});

/**
 * Take an event on the description and swap out the description for a text box.
 *
 * @param {Event} event the event object
 */
function toggleDescriptionEdit(desc) {
  const textBox = desc.nextElementSibling;
  // textBox.value = description;
  textBox.value = desc.innerText;
  textBox.classList.remove('d-none');
  desc.classList.add('d-none');
  textBox.focus();
}

/**
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event} event the event object
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {
  let desc = textBox.previousElementSibling;
  if (save) {
    desc.innerText = textBox.value;
  }
  textBox.classList.add('d-none');
  desc.classList.remove('d-none');
}

/**
 * I will show / hide the add review form
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {
    form.classList.remove('d-none');
    btn.innerText = 'Hide Form';
    document.getElementById('name').focus();
  } else {
    resetFormValues();
    form.classList.add('d-none');
    btn.innerText = 'Add Review';
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {
  const form = document.querySelector('form');
  const inputs = form.querySelectorAll('input');
  inputs.forEach((input) => {
    input.value = '';
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * I will save the review that was added using the add review from
 */
function saveReview() {
  // get each element in the form
  const name = document.getElementById('name');
  const title = document.getElementById('title');
  const review = document.getElementById('review');
  const rating = document.getElementById('rating');

  // use values to create new review
  const newReview = {
    reviewer: name.value,
    title: title.value,
    review: review.value,
    rating: rating.value
  }
  
  // add review to reviews array
  reviews.push(newReview);

  // call the code to display the new
  // review. this is needed because plain JavaScript
  // os not reactive.. meaning the reviews array
  // is not actually connnected to what we are seeing on
  // the screen in a "live" sense where our list of
  // displayed items will update oif we add a review
  // to the array
  displayReview(newReview);

  // once new review is displayed, hide the form again
  showHideForm();
}

<template>
  <div>
    <a
      id="show-form-button"
      href="#"
      v-if="showForm === false"
      v-on:click.prevent="showForm = true"
    >Show Form</a>

    <form v-on:submit.prevent="addNewReview" v-if="showForm === true">
      <div class="form-element">
        <label for="reviewer">Name:</label>
        <input id="reviewer" type="text" v-model="newReview.reviewer" />
      </div>
      <div class="form-element">
        <label for="title">Title:</label>
        <input id="title" type="text" v-model="newReview.title" />
      </div>
      <div class="form-element">
        <label for="rating">Rating:</label>
        <select id="rating" v-model.number="newReview.rating">
          <option value="1">1 Star</option>
          <option value="2">2 Stars</option>
          <option value="3">3 Stars</option>
          <option value="4">4 Stars</option>
          <option value="5">5 Stars</option>
        </select>
      </div>
      <div class="form-element">
        <label for="review">Review:</label>
        <textarea id="review" v-model="newReview.review"></textarea>
      </div>
      <input type="submit" value="Save" v-bind:disabled="disabledText" />
      <input type="button" value="Cancel" v-on:click.prevent="resetForm" />
    </form>
  </div>
</template>

// note that we can define newReview with only the favorited property
// because the v-model linking in the form will set those properties
// as  you type and JavaScript will add a property to an object if you
// set a value for a prop that does not exist in the object. That
// means that by the time you add reviews, all the props will exist
// in newReview (as long as datat was provided... we didn't include 
// any validation)

<script>
export default {
  name: "add-review",
  data() {
    return {
      showForm: false,
      newReview: {
        favorited: false,
      },
      disabledText: false
    };
  },
  methods: {
    addNewReview() {
      // call the store mutation to add the review to our data
      this.$store.commit('ADD_REVIEW', this.newReview)
      this.resetForm();
    },
    resetForm() {
      this.showForm = false;
      this.newReview = {};
    },
  },
};
</script>

<style>
div.form-element {
  margin-top: 10px;
}
div.form-element > label {
  display: block;
}
div.form-element > input,
div.form-element > select {
  height: 30px;
  width: 300px;
}
div.form-element > textarea {
  height: 60px;
  width: 300px;
}
form > input[type="button"] {
  width: 100px;
}
form > input[type="submit"] {
  width: 100px;
  margin-right: 10px;
}
</style>

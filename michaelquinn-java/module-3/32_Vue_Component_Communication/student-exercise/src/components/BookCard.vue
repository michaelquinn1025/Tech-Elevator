<template>
  <div class="card">
      <h2 class="book-title"> {{ paperback.title }}</h2>
    
    <img v-if="paperback.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + paperback.isbn + '-M.jpg'" />
    <h3 class="book-author">{{ paperback.author }}</h3>
    <button v-bind:class="{ 'mark-read' : paperback.read != true, 'mark-unread' : paperback.read == true}"
        v-on:click="updateReadStatus">{{ paperback.read ? 'Mark Unread' : 'Mark Read' }}</button>
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ["paperback"],
    methods: {
        updateReadStatus() {
            this.$store.commit('FLIP_READ_STATUS', this.paperback);
        }
    }
    
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>
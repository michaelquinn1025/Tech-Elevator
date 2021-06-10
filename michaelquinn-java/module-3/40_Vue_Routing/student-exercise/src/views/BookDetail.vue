<template>
    <div>
        <h2>{{ book.title }}</h2>
        <h2>{{ book.author }}</h2>
        
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    
    </div>
</template>

<script>
export default {
    name: 'book-detail',
    
    computed: {
        book() {
            return this.$store.state.books.find((curBook) => {
                return curBook.isbn === this.$route.params.isbn;
            });
        }
    }

}
</script>

<style>

</style>
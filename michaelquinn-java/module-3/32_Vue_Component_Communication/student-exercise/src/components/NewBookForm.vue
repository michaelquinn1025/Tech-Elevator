<template>
    <div>
        <form v-on:submit.prevent="addBook">
            <label for="title">Title</label>
            <input  id="title" class="title-input" type="text" v-model="newBook.title" />


            <label for="author">Author</label>
            <input  id="author" class="author-input" type="text" v-model="newBook.author" />

            <label for="isbn">ISBN</label>
            <input  id="isbn" class="isbn-input" type="text" v-model="newBook.isbn" />

            <input type="submit" value="Save" />

        </form>
    </div>
</template>

<script>
export default {
    name: 'new-book-form',
    data() {
        return {
            newBook: {
                read: false
            }
        }
    },
    methods: {
        addBook() {
            this.$store.commit('ADD_BOOK', this.newBook);
        }
    }

}
</script>

<style>

</style>
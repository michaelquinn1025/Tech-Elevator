<template>
    <div id="app" class="main">
        <h1>{{ product.name }}</h1>
        <p class="description">{{ product.description }}</p>
        <div class="actions">
            <a href="#">Back to Products</a>&nbsp;|<router-link v-bind:to="{ name: 'add-review-view', params: { productId: product.id }}">
                Add Review</router-link>
        </div>
        <div class="well-display">
            <average-summary />
            <star-summary rating="1" />
            <star-summary rating="2" />
            <star-summary rating="3" />
            <star-summary rating="4" />
            <star-summary rating="5" />
        </div>
        <review-list />
    </div>
</template>

<script>

import AverageSummary from '@/components/AverageSummary';
import StarSummary from '@/components/StarSummary';
import ReviewList from '@/components/ReviewList';

export default {

    name: 'product-detail',
    components: {
        AverageSummary,
        StarSummary,
        ReviewList
    },
    computed: {
        product() {
            return this.$store.state.products.find( (product) => {
                return product.id == this.$store.state.activeProduct;
            })
        }
    },
    created() {
        const activeProductID = this.$route.params.productId;
        this.$store.commit('SET_ACTIVE_PRODUCT', activeProductID);
    }

}
</script>

<style>

</style>
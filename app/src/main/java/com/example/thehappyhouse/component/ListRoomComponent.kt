package com.example.thehappyhouse.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.thehappyhouse.response.ProductResponse
import com.example.thehappyhouse.viewModel.ProductViewModel

@Composable
fun ProductListScreen() {
    val productViewModel: ProductViewModel = viewModel()
    val products by productViewModel.products.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        productViewModel.fetchAllProducts()
    }

    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(products ?: emptyList()) { product ->
                ProductItem(product)
            }
        }
    }
}

// A Composable to display a single product
@Composable
fun ProductItem(product: ProductResponse) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = product.productName, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
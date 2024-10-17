@file:Suppress("DEPRECATION")

package com.example.thehappyhouse.component
import android.R
import androidx.compose.foundation.BorderStroke

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.filledTonalShape
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun TextComponent(value: String) {
   Text(
         text = value,
         modifier = Modifier
             .fillMaxWidth()
             .padding(8.dp),
         style = TextStyle(
            fontSize = 18.sp,
             fontWeight = FontWeight.Normal,
             fontStyle = FontStyle.Normal
         ),
         color = Color.Black,
         textAlign = TextAlign.Left
     )
 }




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldComponent(
    labelValue: String,
    onValueChanged: (String) -> Unit
) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text(text = labelValue) },
        value = textValue.value,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.black),
            focusedLabelColor = colorResource(id = R.color.black),
            cursorColor = colorResource(id = R.color.black),
        ),
        keyboardOptions = KeyboardOptions.Default,
        onValueChange = {
            textValue.value = it
            onValueChanged(it)
        },
        leadingIcon = {
            Icon(painter = painterResource(id = R.drawable.star_on), contentDescription = "")
        }
    )
    Spacer(modifier = Modifier.heightIn(12.dp))
}
@Composable
fun DivideScreen(){
    Row(modifier = Modifier.fillMaxWidth()){
        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        color = Color.Black,
            thickness = 1.dp
        )
    }
}

@Composable
fun LineStarLogo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Divider(
                color = Color.Gray,
                thickness = 5.dp,
                modifier = Modifier.width(120.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.star_on),
                contentDescription = null,
                modifier = Modifier.size(75.dp)
            )
            Divider(
                color = Color.Gray,
                thickness = 5.dp,
                modifier = Modifier.width(120.dp)
            )
        }
        StyledText()
    }
}

@Composable
fun StyledText() {
    val annotatedText = buildAnnotatedString {
        withStyle(
            style = ParagraphStyle(
                lineHeight = 50.sp
            )
        ) {
            withStyle(
                style = SpanStyle(
                    color = Color.DarkGray  ,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                )
            ) {
                append("Hello! \n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color.Black,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                )
            ) {
                append("WELCOME BACK")
            }
        }
    }
    Text(
        text = annotatedText,
        modifier = Modifier.width(300.dp),
        fontSize = 27.sp
    )
}
@Composable
fun UsernameField(username: String, onUsernameChange: (String) -> Unit, function: () -> Unit) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = username,
        onValueChange = onUsernameChange,
        label = { Text("Username") },
    )
}

@Composable
fun PasswordField(password: String, onPasswordChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password,
        onValueChange = onPasswordChange,
        label = { Text("Password") },
        visualTransformation = PasswordVisualTransformation()
    )
}

@Composable
fun LoginButton(modifier: Modifier = Modifier, onLoginClick: () -> Unit) {
    Button(
        onClick = onLoginClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = "Login",
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}

@Composable
fun NavButton(navController: NavController, route: String, icon: @Composable () -> Unit) {
    FloatingActionButton(
        onClick = { navController.navigate(route) },
    ) {
        icon();
    }
}

@Composable
fun ImageWithPadding(painter: Painter, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Image(
            painter = painter,
            contentDescription = description,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(120.dp)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.heightIn(8.dp))
        Text(
            text = description,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Composable
fun AutoScrollingCarousel() {
    val listState = rememberLazyListState()
    val images = listOf(
        R.drawable.ic_menu_report_image,
        R.drawable.ic_menu_report_image,
        R.drawable.ic_menu_report_image
    )

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            val itemCount = images.size
            val currentIndex = listState.firstVisibleItemIndex

            val nextIndex = if (currentIndex < itemCount - 1) {
                currentIndex + 1
            } else {
                0
            }
            listState.animateScrollToItem(nextIndex)
        }
    }

    LazyRow(
        state = listState,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(images) { imageRes ->
            Box(
                modifier = Modifier
                    .width(300.dp)
                    .height(200.dp)
            ) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = "Auto-scrolling Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

//Filled Button
@Composable
fun FilledTonalButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: androidx.compose.ui.graphics.Shape = filledTonalShape,
    colors: ButtonColors = ButtonDefaults.filledTonalButtonColors(),
    elevation: ButtonElevation? = ButtonDefaults.filledTonalButtonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable RowScope.() -> Unit
): Unit {
}

@Composable
fun ButtonPage(navController: NavController, route: String) {
    FloatingActionButton(
        onClick = { navController.navigate(route) },
    ) {
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen() {
    var searchQuery by remember { mutableStateOf("") }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.width(350.dp),
            contentAlignment = Alignment.Center
        ) {
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search") },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                leadingIcon = {
                    IconButton(
                        onClick = { /* Handle search action */ }
                    ) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                }
            )
        }
    }
}

@Composable
fun ButtonBasic(navController: NavController, address: String, content: String, modifier: Modifier) {
    FloatingActionButton(
        onClick = { navController.navigate(address) },
        modifier = modifier.padding(horizontal = 20.dp, vertical = 10.dp) // Điều chỉnh padding theo ý muốn
    ) {
        Text(text = content)
    }
}


@Composable
fun FavoriteButton(navController: NavController, address: String) {
    IconButton(
        onClick = { /* Xử lý hành động khi nhấn vào nút yêu thích */ }
    ) {
        Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
    }
}


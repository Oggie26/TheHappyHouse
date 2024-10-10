package com.example.thehappyhouse.component
import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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
package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    JetpackComposeTutorialApp()
                }
            }
        }
    }
}

@Composable
fun JetpackComposeTutorialApp(){
    JetpackComposeTutorialText(
        subject = stringResource(R.string.Subject_text) ,
        abstract = stringResource(R.string.Abstract_text) ,
        body = stringResource(R.string.Body_text),
        image = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun JetpackComposeTutorialText(subject: String, abstract: String,
    body: String, image: Painter, modifier: Modifier = Modifier) {
    Column {
        Image(painter = image, contentDescription = null)
        Text(
            text = subject,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = abstract,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }


}


@Preview(showBackground = true)
@Composable
fun JetpackComposeTutorialPreview() {
    JetpackComposeTutorialTheme {
        JetpackComposeTutorialApp()
    }
}
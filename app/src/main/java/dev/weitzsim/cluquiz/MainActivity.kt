package dev.weitzsim.cluquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.weitzsim.cluquiz.repositories.DefaultData
import dev.weitzsim.cluquiz.ui.theme.CluquizTheme
import dev.weitzsim.cluquiz.viewmodels.UserViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.koinInject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CluquizTheme {
                App()
            }
        }
    }
}

@Composable
fun App(){
    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center){
        val userName = DefaultData.DEFAULT_USER.name
        FactoryInject(userName)
        ViewModelInject(userName)
        Greeting(name = "mein Name")
        RequestButton()
    }
}

@Composable
fun FactoryInject(userName : String, presenter: UserStateHolder = koinInject()){
    Text(text = presenter.sayHello(userName), modifier = Modifier.padding(8.dp))
}


@Composable
fun ViewModelInject(userName : String, viewModel: UserViewModel = koinViewModel()){
    Text(text = viewModel.sayHello(userName), modifier = Modifier.padding(8.dp))
}

@Composable
fun RequestButton (){
    Button(onClick = {
        runBlocking {
            CluquizHTTPClient().makeRequest()
        }
    }) {
        Text(text = "Request")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CluquizTheme {
        Greeting("Android")
    }
}
package com.example.helpme

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core_ui.components.AppScaffold
import com.example.core_ui.components.InputField
import com.example.core_ui.components.PrimaryButton
import com.example.core_ui.components.PrimaryText
import com.example.core_ui.ui.HelpMeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Preview(
    name = "Dark Mode Preview",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DarkModePreview() {
    HelpMeTheme(darkTheme = true) {
        SampleScreen()
    }
}

@Preview(
    name = "Light Mode Preview",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun LightModePreview() {
    HelpMeTheme(darkTheme = false) {
        //DarkModeTestScreen()
        SampleScreen()
    }
}
@Composable
fun DarkModeTestScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        PrimaryText(
            text = "Headline Medium!",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        PrimaryText(
            text = "Body Medium",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(modifier = Modifier.height(8.dp))
        PrimaryText(
            text = "Label Large",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.labelLarge
        )
        Spacer(modifier = Modifier.height(8.dp))
        PrimaryButton(
            text = "Continue",
            onClick = { /* action */ },
            leadingIcon = Icons.Default.ArrowForward // optional
        )

        InputField(
            value = "username",
            onValueChange = { },
            label = "",
            placeholder = "Enter your username"
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleScreen() {
    val snackbarHostState = remember { SnackbarHostState() }
    AppScaffold(
        topBar = { TopAppBar(title = { Text(text = "Help Me", style = MaterialTheme.typography.headlineMedium) }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimary
        )) },
        snackbarHostState = snackbarHostState,
        floatingActionButton = {
            FloatingActionButton(onClick = {
                // Trigger a snackbar
                CoroutineScope(Dispatchers.Main).launch {
                    snackbarHostState.showSnackbar("FAB clicked")
                }
            },
                containerColor = MaterialTheme.colorScheme.primary) {
                Icon(Icons.Default.Add, contentDescription = null)
            }
        }
    ) { padding ->
        DarkModeTestScreen()
    }

}
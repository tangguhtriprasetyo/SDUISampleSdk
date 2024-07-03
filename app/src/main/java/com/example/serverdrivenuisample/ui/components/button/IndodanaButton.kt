package com.example.serverdrivenuisample.ui.components.button

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.R
import com.example.serverdrivenuisample.entity.section.components.ActionDeeplink
import com.example.serverdrivenuisample.entity.section.components.ActionToast
import com.example.serverdrivenuisample.entity.section.components.ButtonType
import com.example.serverdrivenuisample.entity.section.components.ComponentAction
import com.example.serverdrivenuisample.ui.components.text.TextTitleMedium
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryButtonTextDisabled
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryOrange
import com.example.serverdrivenuisample.ui.theme.IndodanaShadesYellow20
import com.example.serverdrivenuisample.ui.theme.ServerDrivenUISampleTheme

@Composable
fun IndodanaButton(
    buttonType: ButtonType,
    componentAction: ComponentAction? = null,
    title: String,
    enabled: Boolean = true,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 8.dp)
) {
    val context = LocalContext.current

    when (buttonType) {
        ButtonType.PRIMARY -> {
            IndodanaButtonPrimary(
                title = title,
                enabled = enabled,
                modifier = modifier,
                onClick = {
                    if (componentAction != null) {
                        getComponentAction(context, componentAction)
                    } else {
                        onClick()
                    }
                }
            )
        }

        ButtonType.SECONDARY -> {
            IndodanaButtonSecondary(
                title = title,
                enabled = enabled,
                modifier = modifier,
                onClick = {
                    if (componentAction != null) {
                        getComponentAction(context, componentAction)
                    } else {
                        onClick()
                    }
                }
            )
        }
    }
}

@Composable
fun IndodanaButtonPrimary(
    title: String,
    enabled: Boolean = true,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 8.dp)
        .fillMaxWidth()
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.tertiary,
            contentColor = MaterialTheme.colorScheme.onTertiary,
            disabledContainerColor = IndodanaShadesYellow20,
            disabledContentColor = IndodanaPrimaryButtonTextDisabled
        ),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        TextTitleMedium(text = title, textAlign = TextAlign.Center, modifier = Modifier)
    }
}

@Composable
fun IndodanaButtonSecondary(
    title: String,
    enabled: Boolean = true,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 8.dp)
        .fillMaxWidth()
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = IndodanaPrimaryOrange,
            disabledContainerColor = IndodanaShadesYellow20,
            disabledContentColor = IndodanaPrimaryButtonTextDisabled
        ),
        border = BorderStroke(1.dp, IndodanaPrimaryOrange),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        TextTitleMedium(text = title, textAlign = TextAlign.Center, modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun IndodanaButtonPreview() {
    ServerDrivenUISampleTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            IndodanaButtonPrimary(title = stringResource(R.string.app_name), onClick = {})
            IndodanaButtonSecondary(title = stringResource(R.string.app_name), onClick = {})
        }
    }
}

private fun getComponentAction(context: Context, action: ComponentAction) {
    when (action) {
        is ActionToast -> {
            Toast.makeText(context, action.title, Toast.LENGTH_LONG)
                .show()
        }

        is ActionDeeplink -> {
            Toast.makeText(context, "Open Deeplink ${action.deeplink}", Toast.LENGTH_LONG)
                .show()
        }
    }
}
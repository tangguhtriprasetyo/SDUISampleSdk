package com.example.serverdrivenuisample.ui.components.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.BODY_LARGE
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.BODY_MEDIUM
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.BODY_SMALL
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.HEADLINE_LARGE
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.HEADLINE_MEDIUM
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.HEADLINE_SMALL
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.LABEL_LARGE
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.LABEL_MEDIUM
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.LABEL_SMALL
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.TITLE_LARGE
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.TITLE_MEDIUM
import com.example.serverdrivenuisample.entity.section.components.IndodanaTextStyle.TITLE_SMALL
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryBlack
import com.example.serverdrivenuisample.ui.theme.ServerDrivenUISampleTheme

@Composable
fun IndodanaText(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    style: IndodanaTextStyle,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    when (style) {
        HEADLINE_LARGE -> {
            TextHeadlineLarge(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        HEADLINE_MEDIUM -> {
            TextHeadlineMedium(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        HEADLINE_SMALL -> {
            TextHeadlineSmall(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        TITLE_LARGE -> {
            TextTitleLarge(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        TITLE_MEDIUM -> {
            TextTitleMedium(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        TITLE_SMALL -> {
            TextTitleSmall(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        BODY_LARGE -> {
            TextBodyLarge(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        BODY_MEDIUM -> {
            TextBodyMedium(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        BODY_SMALL -> {
            TextBodySmall(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        LABEL_LARGE -> {
            TextLabelLarge(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        LABEL_MEDIUM -> {
            TextLabelMedium(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }

        LABEL_SMALL -> {
            TextLabelSmall(
                text = text,
                color = color,
                textAlign = textAlign,
                overflow = overflow,
                maxLines = maxLines,
                modifier = modifier
            )
        }
    }
}

@Composable
fun TextHeadlineLarge(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.headlineLarge
    )
}

@Composable
fun TextHeadlineMedium(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Composable
fun TextHeadlineSmall(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
fun TextTitleLarge(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun TextTitleMedium(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.titleMedium
    )
}

@Composable
fun TextTitleSmall(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.titleSmall
    )
}

@Composable
fun TextBodyLarge(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Composable
fun TextBodyMedium(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
fun TextBodySmall(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall
    )
}

@Composable
fun TextLabelLarge(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.labelLarge
    )
}

@Composable
fun TextLabelMedium(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.labelMedium
    )
}

@Composable
fun TextLabelSmall(
    text: String,
    color: Color = IndodanaPrimaryBlack,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier,
        style = MaterialTheme.typography.labelSmall
    )
}

@Preview(showBackground = true)
@Composable
fun IndodanaTextPreview() {
    ServerDrivenUISampleTheme {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextHeadlineLarge(text = "Headline Large")
            TextHeadlineMedium(text = "Headline Medium")
            TextHeadlineSmall(text = "Headline Small")
            TextTitleLarge(text = "Title Large")
            TextTitleMedium(text = "Title Medium")
            TextTitleSmall(text = "Title Small")
            TextBodyLarge(text = "Body Large")
            TextBodyMedium(text = "Body Medium")
            TextBodySmall(text = "Body Small")
            TextLabelLarge(text = "Label Large")
            TextLabelMedium(text = "Label Medium")
            TextLabelSmall(text = "Label Small")
        }
    }
}
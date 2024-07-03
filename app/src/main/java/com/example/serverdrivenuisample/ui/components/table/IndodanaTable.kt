package com.example.serverdrivenuisample.ui.components.table

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryBlack
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryGreen
import com.example.serverdrivenuisample.ui.theme.IndodanaPrimaryWhite
import com.example.serverdrivenuisample.ui.theme.IndodanaShadesBlack20

@Composable
fun IndodanaTable(
    modifier: Modifier = Modifier.padding(horizontal = 16.dp),
    headers: List<String>,
    tableData: List<List<String>>,
    headerBackgroundColor: Color = IndodanaPrimaryGreen,
    cellBorderColor: Color = IndodanaShadesBlack20,
    headerTextColor: Color = IndodanaPrimaryWhite,
    cellTextColor: Color = IndodanaPrimaryBlack
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        // Header row
        TableRow(
            data = headers,
            backgroundColor = headerBackgroundColor,
            textColor = headerTextColor,
            cellBorderColor = cellBorderColor,
            style = MaterialTheme.typography.titleLarge
        )

        // Data rows
        tableData.forEach { rowData ->
            TableRow(
                data = rowData,
                backgroundColor = Color.Transparent,
                textColor = cellTextColor,
                cellBorderColor = cellBorderColor,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
fun TableRow(
    data: List<String>,
    backgroundColor: Color,
    textColor: Color,
    cellBorderColor: Color,
    style: TextStyle
) {
    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .background(backgroundColor)
            .border(0.5.dp, cellBorderColor)
    ) {
        data.forEach { cell ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .border(Dp.Hairline, cellBorderColor)
                    .padding(8.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxHeight(),
                    style = style,
                    text = cell,
                    fontSize = 14.sp,
                    color = textColor
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun IndodanaTablePreview() {
    IndodanaTable(
        modifier = Modifier.fillMaxSize(),
        headers = listOf("Header 1", "Header 2"),
        tableData = listOf(
            listOf(
                "Row 1 Col 1.........................................................",
                "Row 1 Col 2.................."
            ),
            listOf("Row 2 Col 1", "Row 2 Col 2"),
            listOf("Row 3 Col 1", "Row 3 Col 2"),
            listOf("Row 4 Col 1", "Row 4 Col 2"),
            listOf("Row 5 Col 1", "Row 5 Col 2"),
            listOf("Row 6 Col 1", "Row 6 Col 2"),
            listOf("Row 7 Col 1", "Row 7 Col 2"),
            listOf("Row 8 Col 1", "Row 8 Col 2"),
            listOf("Row 9 Col 1", "Row 9 Col 2"),
            listOf("Row 10 Col 1", "Row 10 Col 2")
        )
    )
}
package com.example.serverdrivenuisample.ui.builder

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenuisample.R
import com.example.serverdrivenuisample.data.datasource.network.NetworkProvider
import com.example.serverdrivenuisample.dummy.DummyResponseProvider
import com.example.serverdrivenuisample.entity.screen.Screen
import com.example.serverdrivenuisample.entity.section.ComponentSection
import com.example.serverdrivenuisample.entity.section.LayoutSection
import com.example.serverdrivenuisample.entity.section.Section
import com.example.serverdrivenuisample.entity.section.components.Banner
import com.example.serverdrivenuisample.entity.section.components.Button
import com.example.serverdrivenuisample.entity.section.components.Component
import com.example.serverdrivenuisample.entity.section.components.Spacer
import com.example.serverdrivenuisample.entity.section.components.Table
import com.example.serverdrivenuisample.entity.section.components.Text
import com.example.serverdrivenuisample.entity.section.components.TopNavbar
import com.example.serverdrivenuisample.entity.section.LayoutType
import com.example.serverdrivenuisample.ui.components.banner.IndodanaImageBanner
import com.example.serverdrivenuisample.ui.components.button.IndodanaButton
import com.example.serverdrivenuisample.ui.components.navbar.IndodanaTopAppBar
import com.example.serverdrivenuisample.ui.components.table.IndodanaTable
import com.example.serverdrivenuisample.ui.components.text.IndodanaText

@Composable
fun BuildScreen(screen: Screen) {
    CreateLayout(layout = screen.parentLayout) {
        screen.sections.forEach { section ->
            CreateSection(section = section)
        }
    }
}

@Composable
fun CreateSection(section: Section) {
    when (section) {
        is LayoutSection -> {
            CreateLayout(layout = section.layout) {
                section.components.forEach { component ->
                    CreateComponent(component = component)
                }
            }
        }

        is ComponentSection -> {
            CreateComponent(component = section.component)
        }
    }
}

@Composable
fun CreateLayout(layout: LayoutType, content: @Composable () -> Unit) {
    when (layout) {
        LayoutType.COLUMN -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.Start
            ) {
                content()
            }
        }

        LayoutType.ROW -> {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                content()
            }
        }

        LayoutType.BOX -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopStart
            ) {
                content()
            }
        }
    }
}

@Composable
fun CreateComponent(component: Component) {
    when (component) {
        is Text -> {
            IndodanaText(text = component.text, style = component.style)
        }

        is Button -> {
            var modifier: Modifier? = null

            component.buttonModifier?.let {
                modifier = Modifier.padding(
                    top = it.topPadding.dp,
                    bottom = it.topPadding.dp,
                    start = it.topPadding.dp,
                    end = it.topPadding.dp
                )

                if (it.fillMaxWidth) modifier?.fillMaxWidth()
            }

            IndodanaButton(
                buttonType = component.buttonType,
                title = component.title,
                componentAction = component.action,
                modifier = modifier ?: Modifier
                    .padding(horizontal = 8.dp, vertical = 8.dp)
                    .fillMaxWidth()
            )
        }

        is Banner -> {
            IndodanaImageBanner(
                drawable = R.drawable.featured_product_banner,
                title = component.title
            )
        }

        is Table -> {
            IndodanaTable(headers = component.headers, tableData = component.data)
        }

        is TopNavbar -> {
            IndodanaTopAppBar(title = component.title, showBack = component.showBack)
        }

        is Spacer -> {
            Spacer(modifier = Modifier.height(component.height.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestNested() {
    BuildScreen(screen = NetworkProvider.mockResponse(DummyResponseProvider.mockFeaturedProductWithNestedLayout())!!)
}
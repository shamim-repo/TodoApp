package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme

@Composable
fun HintTextField(
    modifier: Modifier = Modifier,
    text : String,
    hint : String,
    singleLine : Boolean = true,
    isHintVisible : Boolean = true,
    textStyle : TextStyle = MaterialTheme.typography.titleLarge,
    onChange : (String) -> Unit,
    onFocusChange : (FocusState) -> Unit,
) {
    Box(modifier = modifier){
        BasicTextField(
            modifier= modifier
                .fillMaxWidth()
                .onFocusChanged { onFocusChange(it) },
            value = text,
            onValueChange = onChange,
            singleLine = singleLine,
            textStyle = textStyle.copy(
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = textStyle.fontSize
            ),
            cursorBrush = SolidColor(MaterialTheme.colorScheme.onSurface)

        )
        
        
        if (isHintVisible){
            Text(
                text = hint,
                style = textStyle
            )
        }
    }

}

@Composable
fun TextF(modifier: Modifier = Modifier) {

    
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HintedTextFieldPreview() {

    TodoAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column {
                HintTextField(
                    text = "Title",
                    hint = "Hint",
                    textStyle = MaterialTheme.typography.headlineMedium,
                    onChange = { },
                    isHintVisible = false,
                    singleLine = true,
                    onFocusChange = { }
                )


                HintTextField(
                    modifier = Modifier.fillMaxSize(),
                    text = "Body",
                    hint = "Hint",
                    textStyle = MaterialTheme.typography.titleLarge,
                    onChange = { },
                    isHintVisible = false,
                    singleLine = true,
                    onFocusChange = { }
                )
            }


        }
    }
    
}

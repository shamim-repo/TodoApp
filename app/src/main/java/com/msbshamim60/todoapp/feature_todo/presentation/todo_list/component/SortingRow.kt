package com.msbshamim60.todoapp.feature_todo.presentation.todo_list.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msbshamim60.todoapp.core.utils.ContentDescription
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme

@Composable
fun SortingRow(
    modifier: Modifier= Modifier,
    text: String,
    isSelected : Boolean
){

    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 3.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = text,
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface,
        )
        if(isSelected) {
            Icon(
                modifier = modifier.size(30.dp),
                imageVector = Icons.Default.Check,
                tint = MaterialTheme.colorScheme.onPrimaryContainer,
                contentDescription = ContentDescription.SELECTED
            )
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SortingRowPreview(){
    TodoAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column {
                SortingRow(text = "Title", isSelected = false)
                SortingRow(text = "Title", isSelected = true)
            }

        }

    }
}
package com.msbshamim60.todoapp.feature_todo.presentation.todo_list.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msbshamim60.todoapp.core.presentation.component.ArchiveButton
import com.msbshamim60.todoapp.core.presentation.component.CompleteButton
import com.msbshamim60.todoapp.core.presentation.component.DeleteButton
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme

@Composable
fun TodoItemCard(
    todoItem: TodoItem,
    modifier : Modifier = Modifier,
    onDeleteClick : () -> Unit,
    onArchiveClick : () -> Unit,
    onCompleteClick : () -> Unit,
    onCardClick : () -> Unit
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = onCardClick,
        colors = CardDefaults.cardColors(
            containerColor = if (todoItem.archived) MaterialTheme.colorScheme.tertiaryContainer else MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Row(
            modifier= modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            CompleteButton(
                modifier = modifier.size(30.dp),
                size = 30.dp,
                isComplete = todoItem.completed,
                onClick = onCompleteClick
            )

            Text(
                text = todoItem.title,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        HorizontalDivider(
            modifier=modifier.padding(horizontal = 10.dp),
            thickness = 2.dp
        )
        Text(
            modifier = modifier.padding(start = 10.dp, top = 5.dp, end = 10.dp),
            text = todoItem.description,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onSurface,
            maxLines = 4,
            overflow = TextOverflow.Ellipsis
        )
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ArchiveButton(
                modifier=modifier.size(30.dp),
                onClick = onArchiveClick,
                isArchived = todoItem.archived
            )

            DeleteButton(
                modifier = modifier.size(30.dp),
                onClick = onDeleteClick,
            )
        }
    }
}


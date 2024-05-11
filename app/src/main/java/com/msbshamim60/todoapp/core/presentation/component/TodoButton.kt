package com.msbshamim60.todoapp.core.presentation.component

import android.content.res.Configuration
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Archive
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Unarchive
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.msbshamim60.todoapp.R
import com.msbshamim60.todoapp.core.utils.ContentDescription
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme

@Composable
fun CompleteButton(
    modifier: Modifier=Modifier,
    isComplete:Boolean,
    size:Dp=30.dp,
    onClick: ()->Unit,
){
    IconButton(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        if (isComplete) {
            Icon(
                modifier = modifier,
                imageVector = Icons.Default.CheckCircle,
                contentDescription = ContentDescription.COMPLETE_ICON_BUTTON,
                tint = Color.Green,
            )
        } else {
            EmptyCircle(
                modifier = modifier,
                size = size,
            )
        }
    }
}

@Composable
fun EmptyCircle(
    modifier: Modifier= Modifier,
    size: Dp=32.dp,
    strokeWith: Float=6f,
    color: Color=MaterialTheme.colorScheme.error
){
    Canvas(
        modifier = modifier,
    ){
        drawCircle(
            color = color,
            radius = size.value,
            center=center,
            style = Stroke(width = strokeWith)
        )
    }
}


@Composable
fun ArchiveButton(
    modifier: Modifier=Modifier,
    onClick: ()->Unit,
    isArchived : Boolean
){
    IconButton(
        onClick = onClick
    ) {
        if (isArchived){
            Icon(
                modifier= modifier,
                imageVector = Icons.Default.Unarchive,
                contentDescription = ContentDescription.ARCHIVE_ICON_BUTTON,
                tint = MaterialTheme.colorScheme.primary,
            )

        }else{
            Icon(
                modifier= modifier,
                imageVector = Icons.Default.Archive,
                contentDescription = ContentDescription.ARCHIVE_ICON_BUTTON,
                tint = MaterialTheme.colorScheme.primary,
            )
        }
    }
}

@Composable
fun DeleteButton(
    modifier: Modifier=Modifier,
    onClick: ()->Unit,
){
    IconButton(
        onClick = { onClick() }
    ) {
        Icon(
            modifier=modifier,
            imageVector = Icons.Default.Delete,
            contentDescription = ContentDescription.DELETE_ICON_BUTTON,
            tint = MaterialTheme.colorScheme.error,
        )
    }
}



@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showSystemUi = true)
@Composable
fun ButtonPreview(){
    TodoAppTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            CompleteButton(isComplete = true, onClick = {})
            EmptyCircle(size = 32.dp)
            ArchiveButton(modifier = Modifier.size(40.dp),
                onClick = {},
                isArchived = false)

            ArchiveButton(modifier = Modifier.size(40.dp),
                isArchived = true, onClick = {})
            DeleteButton(modifier = Modifier.size(40.dp), onClick = {})

        }
    }
}
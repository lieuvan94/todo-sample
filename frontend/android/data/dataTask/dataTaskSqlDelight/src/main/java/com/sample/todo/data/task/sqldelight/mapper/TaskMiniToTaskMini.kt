package com.sample.todo.data.task.sqldelight.mapper

import com.sample.todo.data.core.Mapper
import com.sample.todo.data.task.sqldelight.SelectTaskMini
import com.sample.todo.data.task.sqldelight.TaskMiniEntity
import com.sample.todo.domain.model.TaskMini
import javax.inject.Inject

class TaskMiniToTaskMini @Inject constructor() : Mapper<TaskMiniEntity, TaskMini> {
    override fun invoke(from: TaskMiniEntity): TaskMini {
        return TaskMini(
            id = from.id,
            title = from.title,
            isCompleted = from.completed == 1L
        )
    }
}
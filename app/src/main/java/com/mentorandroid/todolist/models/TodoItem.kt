package com.mentorandroid.todolist.models

class TodoItem {
    companion object Factory {
        fun create(): TodoItem = TodoItem()
    }
    var objectId: String? = null
    var itemText: String? = null
    var done: Boolean? = null
}
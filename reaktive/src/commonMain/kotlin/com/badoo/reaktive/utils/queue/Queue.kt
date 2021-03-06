package com.badoo.reaktive.utils.queue

internal interface Queue<T> {

    val size: Int

    fun offer(item: T)

    fun poll(): T?

    fun clear()
}
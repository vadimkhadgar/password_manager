package com.vadimkor.passwordmanager.database

import androidx.lifecycle.LiveData
import com.vadimkor.passwordmanager.model.UserEntity

class UserRepository(private val userDao: UserDao) {
    val allUsers: LiveData<List<UserEntity>> = userDao.getAll()

    suspend fun insert(user: UserEntity) {
        userDao.insert(user)
    }

    suspend fun update(user: UserEntity) {
        userDao.update(user)
    }

    suspend fun delete(user: UserEntity) {
        userDao.delete(user)
    }
}
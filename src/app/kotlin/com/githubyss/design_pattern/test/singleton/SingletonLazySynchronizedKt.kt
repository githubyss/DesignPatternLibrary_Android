package com.githubyss.design_pattern.test.singleton


/**
 * SingletonLazySynchronizedKt
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:39:12
 */
class SingletonLazySynchronizedKt private constructor() {
    companion object {
        private var INSTANCE: SingletonLazySynchronizedKt? = null

        @Synchronized
        fun getInstance(): SingletonLazySynchronizedKt {
            if (INSTANCE == null) {
                INSTANCE = SingletonLazySynchronizedKt()
            }
            return INSTANCE!!
        }
    }

    var TAG: String = SingletonLazySynchronizedKt::class.java.simpleName
}

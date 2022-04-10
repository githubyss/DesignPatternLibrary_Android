package com.githubyss.design_pattern.test.decorator

import com.githubyss.design_pattern.test.entity.string_handle.IStringEncrypt


abstract class DecoratorStringEncrypt : IStringEncrypt {
    private var stringEncrypt: IStringEncrypt? = null

    fun decorator(stringEncrypt: IStringEncrypt) {
        this.stringEncrypt = stringEncrypt
    }

    override fun encrypt(input: String): String {
        return stringEncrypt?.encrypt(input) ?: input
    }
}
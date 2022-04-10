package com.githubyss.design_pattern.test.decorator

import com.githubyss.design_pattern.test.entity.string_handle.IStringDecrypt


abstract class DecoratorStringDecrypt : IStringDecrypt {
    private var stringDecrypt: IStringDecrypt? = null

    fun decorator(stringDecrypt: IStringDecrypt) {
        this.stringDecrypt = stringDecrypt
    }

    override fun decrypt(input: String): String {
        return stringDecrypt?.decrypt(input) ?: input
    }
}
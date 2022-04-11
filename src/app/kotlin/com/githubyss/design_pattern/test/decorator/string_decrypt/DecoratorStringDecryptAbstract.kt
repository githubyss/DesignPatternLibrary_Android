package com.githubyss.design_pattern.test.decorator.string_decrypt


abstract class DecoratorStringDecryptAbstract : IStringDecrypt {
    private var stringDecrypt: IStringDecrypt? = null

    fun decorator(stringDecrypt: IStringDecrypt) {
        this.stringDecrypt = stringDecrypt
    }

    override fun decrypt(input: String): String {
        return stringDecrypt?.decrypt(input) ?: input
    }
}
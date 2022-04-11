package com.githubyss.design_pattern.test.decorator.string_encrypt


class DecoratorStringEncryptBySharp : DecoratorStringEncryptAbstract() {
    override fun encrypt(input: String): String {
        return "##${super.encrypt(input)}##"
    }
}
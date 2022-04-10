package com.githubyss.design_pattern.test.decorator


class DecoratorStringEncrypt1 : DecoratorStringEncrypt() {
    override fun encrypt(input: String): String {
        return "**${super.encrypt(input)}**"
    }
}
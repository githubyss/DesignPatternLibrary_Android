package com.githubyss.design_pattern.test.decorator


class DecoratorStringDecrypt2 : DecoratorStringDecrypt() {
    override fun decrypt(input: String): String {
        return super.decrypt(input).replace("#", "")
    }
}
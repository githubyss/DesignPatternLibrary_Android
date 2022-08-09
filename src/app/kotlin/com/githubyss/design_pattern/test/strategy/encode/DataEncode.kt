package com.githubyss.design_pattern.test.strategy.encode

import com.githubyss.design_pattern.factory.create


object DataEncode {
    inline fun <reified S : IDataEncode> encode(input: String): String {
        // return FactoryReflectInline<S>().create<S>().encode(input)
        // return FactoryReflectInlineSingleton.create<S>().encode(input)
        return create<S>().encode(input)
    }
}

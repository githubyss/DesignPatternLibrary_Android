package com.githubyss.design_pattern.test.decorator

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.decorator.finery.*
import com.githubyss.design_pattern.test.decorator.string_decrypt.*
import com.githubyss.design_pattern.test.decorator.string_encrypt.*


fun decorator() {
    println("$PREFIX Decorator 装饰模式")
    println()

    println("装扮")
    val finery: IFinery = Finery("我")
    val decoratorFineryByTShirts: DecoratorFineryAbstract = DecoratorFineryByTShirts()
    val decoratorFineryByBigTrouser: DecoratorFineryAbstract = DecoratorFineryByBigTrouser()
    val decoratorFineryBySneaker: DecoratorFineryAbstract = DecoratorFineryBySneaker()
    decoratorFineryByTShirts.decorator(finery)
    decoratorFineryByBigTrouser.decorator(decoratorFineryByTShirts)
    decoratorFineryBySneaker.decorator(decoratorFineryByBigTrouser)
    decoratorFineryBySneaker.show()
    println()


    println("信息处理")
    val input = "Message"
    println("源信息：${input}")

    val stringEncrypt: IStringEncrypt = StringEncrypt()
    val decoratorStringEncryptByStar: DecoratorStringEncryptAbstract = DecoratorStringEncryptByStar()
    val decoratorStringEncryptBySharp: DecoratorStringEncryptAbstract = DecoratorStringEncryptBySharp()
    decoratorStringEncryptByStar.decorator(stringEncrypt)
    decoratorStringEncryptBySharp.decorator(decoratorStringEncryptByStar)
    val outputEncrypt = decoratorStringEncryptBySharp.encrypt(input)
    println("加密后信息：${outputEncrypt}")

    val stringDecrypt: IStringDecrypt = StringDecrypt()
    val decoratorStringDecryptByStar: DecoratorStringDecryptAbstract = DecoratorStringDecryptByStar()
    val decoratorStringDecryptBySharp: DecoratorStringDecryptAbstract = DecoratorStringDecryptBySharp()
    decoratorStringDecryptByStar.decorator(stringDecrypt)
    decoratorStringDecryptBySharp.decorator(decoratorStringDecryptByStar)
    val outputDecrypt = decoratorStringDecryptBySharp.decrypt(outputEncrypt)
    println("解密后信息：${outputDecrypt}")
    println()
}
package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.leifeng.LeifengUndergraduate


class FactoryLeifengUndergraduate : IFactoryLeifeng {
    override fun create(): Leifeng {
        return LeifengUndergraduate()
    }
}
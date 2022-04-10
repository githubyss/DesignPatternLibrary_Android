package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.leifeng.LeifengVolunteer


object FactoryLeifengVolunteer : IFactoryLeifeng {
    override fun create(): Leifeng {
        return LeifengVolunteer()
    }
}
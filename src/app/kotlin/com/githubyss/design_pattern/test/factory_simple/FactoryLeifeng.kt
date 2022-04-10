package com.githubyss.design_pattern.test.factory_simple

import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.leifeng.LeifengType
import com.githubyss.design_pattern.test.entity.leifeng.LeifengUndergraduate
import com.githubyss.design_pattern.test.entity.leifeng.LeifengVolunteer


object FactoryLeifeng {
    fun create(type: LeifengType): Leifeng {
        return when (type) {
            LeifengType.UNDERGRADUATE -> LeifengUndergraduate()
            LeifengType.VOLUNTEER -> LeifengVolunteer()
        }
    }
}
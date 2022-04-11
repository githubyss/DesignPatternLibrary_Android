package com.githubyss.design_pattern.test.observer.by_abstract

import com.githubyss.design_pattern.observer.by_abstract.SubjectAbstractByAbstract


class SubjectConcreteByAbstract : SubjectAbstractByAbstract() {
    override var state: String = ""
}
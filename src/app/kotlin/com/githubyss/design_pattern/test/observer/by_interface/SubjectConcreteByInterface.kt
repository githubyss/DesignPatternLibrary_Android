package com.githubyss.design_pattern.test.observer.by_interface

import com.githubyss.design_pattern.observer.by_interface.SubjectAbstractByInterface


class SubjectConcreteByInterface : SubjectAbstractByInterface() {
    override var state: String = ""
}
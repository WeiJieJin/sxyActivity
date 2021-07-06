package com.github.weijiejin.sxyactivity.services

import com.github.weijiejin.sxyactivity.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

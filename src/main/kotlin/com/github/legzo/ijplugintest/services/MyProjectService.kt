package com.github.legzo.ijplugintest.services

import com.intellij.openapi.project.Project
import com.github.legzo.ijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

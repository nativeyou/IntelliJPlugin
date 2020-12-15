package com.github.nativeyou.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.nativeyou.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

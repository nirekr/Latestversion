#!/usr/bin/groovy

package com.dell.cpsd.SCM

def getPublicRepos() {
    def publicRepos = []
    def response = new URL("https://api.github.com/orgs/dellemc-symphony/repos?per_page=100000").text
    def json = new JsonSlurper().parseText(response)
    json.each {
        publicRepos.add(it."name")   
    }

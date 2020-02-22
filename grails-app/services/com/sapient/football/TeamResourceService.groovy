package com.sapient.football

import grails.transaction.Transactional

@Transactional
class TeamResourceService {

    def getAll() {

        return ["Name":"Dharmpal"]
    }
}

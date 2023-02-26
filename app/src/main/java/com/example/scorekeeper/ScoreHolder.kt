package com.example.scorekeeper

class ScoreHolder {

    fun updateScore(oldData:String):String{
        return (oldData.toInt()+1).toString()
    }

}
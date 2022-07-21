package xyz.borsay.moreobjectsandclasses

import xyz.borsay.moreobjectsandclasses.lockandkey.*


fun main(args: Array<String>){
    val correctKey: Key = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)
    val newKey: Key = Lock.createKey()
    myLock.unlock(newKey)
}




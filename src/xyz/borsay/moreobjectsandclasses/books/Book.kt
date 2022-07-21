package xyz.borsay.moreobjectsandclasses.books

class Book(editor: Editor) {
    var bookName = ""
    var editorsName: String

    init {
        println("Enter  title of the book?")
        bookName = readLine()?:""
        editorsName = generateEditorsName()
        editor.editorsName = editorsName
    }
    companion object {
        fun createEditor() = Editor()
    }

    fun generateEditorsName(): String{
        println("Please Enter the Editors Name")
        return readLine()?:"".toString()
    }
    fun getBookInfo(): ArrayList<String>{
        val bookInfo = arrayListOf(bookName, editorsName)
        return bookInfo
    }
}

class Editor{



    var editorsName: String = ""
    set(value) {
        field = if(field == "") value else field
    }

    var editorsCity: String = ""
    set(value) {
        field = if(field == "") value else field
    }

    var editorsState: String = ""
        set(value) {
            field = if(field == "") value else field
        }
}


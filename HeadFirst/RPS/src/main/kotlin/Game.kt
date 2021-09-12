fun main() {
    val choiceArgs = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(choiceArgs)
    val userChoice = getUserChoice(choiceArgs)
    resultGame(userChoice, gameChoice)
}

fun getGameChoice(choiceArgs:Array<String>): String = choiceArgs[(Math.random() * 3).toInt()]

fun getUserChoice(optionsParams: Array<String>): String{
    var isCorrect = false
    var userChoice = ""
    //Запрашиваем у пользователя элементы из массива optionsParams
    print("Пожалуйста, введите один из предложенных предметов:")
    for (item in optionsParams){
        print(" $item")
    }
    println(".")

    //Считываем то, что ввёл пользователь
    while (!isCorrect){
        val userInput = readLine()?: ""
        if (userInput != null && toUpFirstSymbol(userInput) in optionsParams){
            isCorrect = true
            userChoice = userInput
        } else {
            println("Просьба внимательно прочитать условие.\nВведите одно из слов указанное выше.")
        }
    }
    return userChoice
}

fun toUpFirstSymbol(text:String):String = text.substring(0,1).toUpperCase() + text.substring(1)

fun resultGame(choiceUser: String, choiceGame: String){
    val choiceArgs = arrayOf("Камень", "Ножницы", "Бумага")
    var mChoiceUser = choiceGame
    var mChoiceGame = choiceGame
    var isNotEndGame = true
    while (isNotEndGame){
        if (mChoiceUser.toLowerCase() == mChoiceGame.toLowerCase()){
            println("Одинаково, соперник тоже выбрал $mChoiceGame")
        } else if ((mChoiceUser.toLowerCase() == "камень" && mChoiceGame.toLowerCase() == "ножницы") || (mChoiceUser.toLowerCase() == "бумага" && mChoiceGame.toLowerCase() == "камень")
            || (mChoiceUser.toLowerCase() == "ножницы" && mChoiceGame.toLowerCase() == "бумага")){
            println("Вы победили, возьмите с полки пирожок.\n Ваш соперник выбрал $mChoiceGame. Хотите ещё сыграть?")
        } else {
            println("Вы проиграли, может быть реванш?")
        }
        print(" y - это да/n - это нет ")
        if (readLine().toString().toLowerCase()  == "y"){
            mChoiceUser = getUserChoice(choiceArgs)
            mChoiceGame = getGameChoice(choiceArgs)
        } else isNotEndGame = false
    }
}



class Person {
  var age: Int

  constructor(age: Int) {
    this.age = age
  }

  fun birthday(){
    age = age + 1
  }

  fun isUnderage() : Boolean {
    return(age < 18)
  }
}

/*
Es wurde eine Klasse erstellt namens Person mit einer Eigenschaft 'age' und einem sekundären Konstruktor.
Außerdem befindet sich in der Klasse 2 Methoden namens birthday und isUnderage.
Die Methode birthday erhöht das Alter um 1
Die Methode isUnderage gibt einen Boolean Wert zurück. Wenn das Alter kleiner als 18 ist kommt true, andernfalls false.

Es wurde ein Objekt-Instanz erstellt von einer Person 15 Jahre.
Danach wurde die Methode birthday genutzt sodass die Person 16 ist.
Output: true
 */

fun main (){
    var person = Person(15)
    person.birthday()
    println(person.isUnderage())

}

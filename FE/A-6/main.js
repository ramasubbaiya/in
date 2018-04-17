/**
 * FUNCTION CONSTRUCTOR
 * @param {string} firstname 
 * @param {string} lastname 
 */
function Person(firstname, lastname) {
    console.log(this);
    this.firstname = firstname;
    this.lastname = lastname;
    console.log('Person function in invoked');
}

Person.prototype.getFullName = function() {
    return this.firstname + ' ' + this.lastname;
}

console.log('1. Person => ', Person);

// creating object using function constructor
var john = new Person('John', 'Doe');
// this - refers to Person object


console.log('2. john => ', john);

// call prototype method
console.log(john.getFullName());

// without new keyword it is regular object
var joe = Person('Joe', 'Don');
// this - refers to window object

console.log('3. joe => ', joe); // undefined - because it doesn't return anything

/**
 * OBJECT.CREATE AND PURE PROTOTYPAL INHERITANCE
 * regular object
 */
var anotherPerson = {
    firstname: 'Default',
    lastname: 'Default',
    getFullName: function() {
        return firstname + ' ' + lastname;
    }
};

// the object create, creates prototype variables and methods
var anotherJohn = Object.create(anotherPerson);

/**
 * 
 * Console output for the below example
 * 
 * Object
 *  __proto__: 
 *      firstname: "Default"
 *      getFullName: ƒ ()
 *      lastname: "Default"
 *      __proto__: Object
 */
console.log('4. anotherJohn => ');
console.dir(anotherJohn);

// To override properties
anotherJohn.firstname = 'Rama';
anotherJohn.getFullName = function() {
    return ' Overridden full name';
}

console.log('5. anotherJohn => ', anotherJohn);

/**
 * CLASS BASED INHERITANCE
 * Here extends - set the prototype properties of the Person class/object
 */
class InformalPerson extends Person {
    constructor(firstname, lastname) {
        super(firstname, lastname)
    }

    greet() {
        return 'Hello ' + firstname;
    }
}
console.log('6. InformalPerson => ');
console.dir(InformalPerson);

console.log('7. Marsupial extends Mammal class ');
/**
 * In Js fiddle create a constructor called mammal with legs as property 
 * and getLegs method, extend mammal to create marsupial which has diet
 * ( example: diet=grass) as its own property and method isVegetarian . 
 * Ultimately create kangaroo object from marsupial constructor.
 */
let Mammal = function(legs) {
    this.legs = legs;
}

// Add a prototype method to mammal
Mammal.prototype.getLegs = function() {
    return this.legs;
}

// create a new function constructor
let Marsupial = function(legs, diet) {
    Mammal.call(this, legs); // similar to `this.legs = legs`
    this.diet = diet;
}

// Also for the new class, create function constructor
Marsupial.prototype.constructor = Marsupial;

// To extend a existing class/object we need to get prototype properties
Marsupial.prototype = Object.create(Mammal.prototype);

// Add a new prototype method
Marsupial.prototype.isVegetarian = function() {
    return this.diet;
}

// create a object using the class/function constructor
let kangaroo = new Marsupial(2, 'grass');
console.log(kangaroo);
console.log(kangaroo.legs);
console.log(kangaroo.diet);
console.log(kangaroo.isVegetarian());
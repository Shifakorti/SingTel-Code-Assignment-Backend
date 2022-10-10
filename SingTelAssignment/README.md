A. Let’s start with the basics

FIRST COMMIT
1. Can you implement the sing() method for the bird?
-->Yes Implemented the sing() method for bird.
1. How did you unit test it?
-->created a BirdTest class inside com.assignment.test package
2. How did you optimize the code for maintainability?
-->Changed the Animal type from class to Interface to group related methods.All the methods inside interface are abstract by default.

SECOND COMMIT
2. Now, we have 2 special kinds of birds: the Duck and the Chicken ... Can you
implement them to make their own special sound?
-->Yes created Duck and Chicken classes that extends Bird
1. A duck says: “Quack , quack ”
2. A duck can swim
3. A chicken says: “ Cluck, cluck ”
4. A chicken cannot fly 

THIRD COMMIT
3.Now how would you model a rooster?
-->Rooster is adult male chicken(Chicken is Bi-gender), whereas Hen is adult female chicken. Created Rooster.class which extends Chicken.class class.
1. A rooster says: “ Cock-a-doodle-doo ”
2. How is the rooster related to the chicken?
-->Chicken is Bi-gender, Rooster is male adult chicken.
3. Can you think of other ways to model a rooster without using inheritance?
--> We can use Delegation that is Alternative to Inheritance.We can  use an object of Chicken class as an instance variable, and forward messages to the instance.

FOURTH COMMIT
4. Can you model a parrot? We are specifically interested in three parrots, one that lived
in a house with dogs one in a house with cats , the other lived on a farm next to
the rooster.
1. A parrot living with dogs says: “Woof, woof”
2. A parrot living with cats says: “ Me ow”
3. A parrot living near the rooster says: “ Cock-a-doodle-doo ”
4. How do you keep the parrot maintainable? What if we need another parrot lives
near a Duck? Or near a phone that rings frequently?

--> Created Parrot.class that extends Bird.It inherit all bird class methods. 
-->While we create Parrot object we can pass parameter of animal type that it is living with.This way we can create parrot instance that Parrot is living to get the desired behaviour(Singing).Even if the parrot is living with Ducks or any other animal.
-->If we initially did not create instance of parrot with living other animal. Then we can do it later by livingWith(Animal animal) method. 
-->It also uses delegation with the method sing() to forward call.
-->To create parrot instance with types other than animal, we can acheive it by constructor overloading or method overloading.
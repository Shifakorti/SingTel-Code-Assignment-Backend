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
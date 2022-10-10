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
-->While we create Parrot object we can pass parameter of animal type that it is living with.This way we can create parrot instance that Parrot is living to get the desired behaviour (Singing).Even if the parrot is living with Ducks or any other animal.
-->If we initially did not create instance of parrot with living other animal. Then we can do it later by livingWith(Animal animal) method. 
-->It also uses delegation with the method sing() to forward call.
-->To create parrot instance with types other than animal, we can achieve it by constructor overloading or method overloading.

FIFTH COMMIT

B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish?
1. Fishes don’t sing
2. Fishes don’t walk
3. Fishes can swim

--> Created Fish class which implements Animal interface. This way it inherits all methods of Animal class.
--> Changed the body of sing(),walk(),swim() method's.

2. Can you specialize the fish as a Shark and as a Clownfish?
1. Sharks are large and grey
2. Clownfish are small and colourful (orange)
3. Clownfish make jokes
4. Sharks eat other fish

--> Created Shark and Clownfish classes which extends Fish class.
-->Created properties size and color in shark and clownfish class.
-->created makeJokes() method in clownfish class and eatOtherFish() method in shark class.

3. Dolphins are not exactly fish, yet, they are good swimmers
1. Can you model a dolphin that swims without inheriting from a fish class?
Yes.We can create Dolphin class which shows fish behaviour. Initializing fish class we can use swim method without inheritance.

2. How do you avoid duplicating code or introducing unneeded overhead?
Using Composition we can Solve this.

C. Model animals that change their behaviour over time
1. Can you model a butterfly?
1. A butterfly can fly
2. A butterfly does not make a sound
-->Created Class Butterfly that implements Animal Interface

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
1. A caterpillar cannot fly
2. A caterpillar can walk (crawl)
--> Created a Property which represents behaviour isCaterpiller. Just set property to true to false to show metamorphosis from caterpillar to butterfly.

D. Counting animals
Suppose you have an array of animals, e.g.

Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin (),
new Frog (),
new Dog(),
new Butterfly (),
new Cat()
};

Note : The above instantiation may be different if you chose to set up your object model
differently... (hopefully you did)
1. Can you share the code to count:
1. How many of these animals can fly?
2. How many of these animals can walk?
3. How many of these animals can sing?
4. How many of these animals can swim?

-->Added Code in Solution.java class to count the number of animals that can fly,swim,walk, and sing.

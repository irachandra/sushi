# sushi
Java program with OOP examples

In this assignment, I created a set of classes that represent ingredients for pieces of sushi.

I emplyed inheritance to implement these classes. The easiest way to do this is was to create a single parent class implementing the interface that encapsulates all of the information about an ingredient as private fields. I then created individual subclasses for each specific ingredient. The constructor of each ingredient subclass will simply call the superclass constructor, passing the appropriate values from the table as arguments.


Then I created classes to encapsulate an instance of Ingredient, representing the ingredient that it is a portion of. For example, AvocadoPortion should use an instance of Avocado as its ingredient. The IngredientPortion classes should also implement the combine method to use the appropriate subclass according to which ingredient it is. For example, combining an instance of AvocadoPortion with another instance of AvocadoPortion should return a new instance of AvocadoPortion.

As I implemented the IngredientPortion classes, I had to think about whether or not to reuse the same ingredient instance for every ingredient portion of the same type. This became a question of immutability.

A piece of sashimi is comprised of 0.75 ounces of some type of seafood. There are five types of sashimi: tuna, yellowtail, eel, crab, and shrimp. The Sashimi class should define a public enumeration called SashimiType.

A piece of nigiri is comprised of 0.75 ounces of some type of seafood and 0.5 ounces of rice. There are five types of nigiri: tuna, yellowtail, eel, crab, and shrimp. The Nigiri class should define a public enumeration called NigiriType.

A roll is a sushi creation that may be comprised of any number of different ingredient portions. 

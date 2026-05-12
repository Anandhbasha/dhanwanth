import java.util.*;
class iterotorDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        for(String s : list)
        {
            System.out.println(s);
        }
    }
}




//     # Iterable vs Iterator in Java

// | Feature        | Iterable                                     | Iterator                  |
// | -- | -- | - |
// | Package        | `java.lang`                                  | `java.util`               |
// | Purpose        | Represents a collection that can be iterated | Used to traverse elements |
// | Main Method    | `iterator()`                                 | `hasNext()`, `next()`     |
// | Works On       | Collection object                            | Individual elements       |
// | Used In        | Enhanced for loop                            | Manual iteration          |
// | Interface Type | Parent interface                             | Traversing interface      |

// # 1. Iterable

// `Iterable` means:

//“Object can be traversed”

// If a class implements `Iterable`, we can use:


// for-each loop



// # How Iterable Works

// Inside the collection:


// iterator()


// method exists.

// It returns an `Iterator`.



// s2. Iterator

// Iterator` is used to move one-by-one through elements.

// Methods:


// hasNext()
// next()
// remove()




//  Example


// How Iterator Works

// ## Step 1


// Iterator<String> it = list.iterator();


// Gets iterator object.



// ## Step 2


// it.hasNext()


// Checks next element exists or not.

// Returns:

// * `true`
// * `false`



// ## Step 3


// it.next()


// Moves to next element.



// # Real World Example

// ## Iterable

// A bookshelf.

// You CAN go through books.



// ## Iterator

// Your hand moving book-by-book.



// # Easy Memory Trick

// ## Iterable

//  “Can be iterated”

// Collection ready for traversal.



// Iterator

// Actually iterating
// Moves element by element.



// Important Interview Points

// Iterable

// * Parent of Collection
// * Contains `iterator()`
// * Used in for-each loop



// Iterator

// * Traverses collection
// * Contains `hasNext()` and `next()`
// * Supports remove operation



// Relationship


// Iterable  ->  iterator()  ->  Iterator
// # Short Difference
// Iterable = Collection can be traversed
// Iterator = Used to traverse collection
// for-each loop -> Iterable
// while loop -> Iterator


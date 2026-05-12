import java.util.*;
//Used when a class has one default sorting order.
class newStudents implements Comparable<newStudents>
{
    int marks;
    String name;

    newStudents(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(newStudents s)
    {
        return this.marks - s.marks;
    }
}

class ComparableDemo
{
    public static void main(String[] args)
    {
        ArrayList<newStudents> list = new ArrayList<>();

        list.add(new newStudents("Arun", 85));
        list.add(new newStudents("Bala", 70));
        list.add(new newStudents("Charan", 95));

        Collections.sort(list);

        for(newStudents s : list)
        {
            System.out.println(s.name + " " + s.marks);
        }
    }
}


//  Comparable vs Comparator in Java

// | Feature             | Comparable                         | Comparator                         |
// | Package             | `java.lang`                        | `java.util`                        |
// | Method Used         | `compareTo()`                      | `compare()`                        |
// | Purpose             | Default sorting                    | Custom sorting                     |
// | Modified Class      | Original class itself              | Separate class                     |
// | Sorting Logic Count | One sorting logic                  | Multiple sorting logics            |
// | Syntax              | `class A implements Comparable<A>` | `class B implements Comparator<A>` |


//Real World Example

// Comparable

// College register number sorting.

// Every student has:

// * Reg No
// * Name
// * Department

// Default sorting = Reg No

// So Comparable is enough.



// Comparator

// Teacher wants:

// * Sort by marks
// * Sort by attendance
// * Sort by name

// Different sorting methods needed.

// So Comparator is used.



//  Easy Memory Trick

// Comparable

//Compare WITH itself"

// Class itself contains sorting logic.



//  Comparator

//Compare using another class"

// Separate class handles sorting.



//  Important Interview Points

//  Comparable

// * Single sorting
// * compareTo()
// * Inside same class

//  Comparator

// * Multiple sorting
// * `compare()`
// * Separate class



//  Short Difference


// Comparable = Default sorting
// Comparator = Custom sorting


// Comparable -> compareTo()
// Comparator -> compare()

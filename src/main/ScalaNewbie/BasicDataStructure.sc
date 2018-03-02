//Arrays
//Arrays preserve order,
// can contain duplicates,
// and are mutable.
val numbers_array = Array(1,2,3,4,5,1,2,3,4,5)
numbers_array(3)
numbers_array(3) = 10
numbers_array(3)
numbers_array


// Lists
//Lists preserve order,
// can contain duplicates,
// and are immutable.

val numbers_list = List(1,2,3,4,5,1,2,3,4,5)
numbers_list(3)
//numbers_list(3) = 10
numbers_list


def and(x:Boolean,y: =>Boolean) = if(x) y else false
and(true,true) == true && true

def constOne(x:Int, y: =>Int) = 1

constOne(2,4)
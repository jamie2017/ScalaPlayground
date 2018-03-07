val f = (x: Double) => x * x
f(3)

val sum = (x: Double, y: Double) => x + y

sum(2,3)


def sum3(x: Double, y: Double, z: Double): Double = x + y + z

sum3(1,2,3)

def mult3(x: Double, y: Double, z: Double): Double = x * y * z

mult3(1,2,3)

def min3(x: Double, y: Double, z: Double): Double = x min y min z

min3(1,2,3)

def combine3(x: Double, y: Double, z: Double, f: (Double, Double) => Double ) = f(f(x,y),z)


combine3(1,2,3, (x,y) => x + y)
combine3(1,2,3, _ + _)
combine3(1,2,3, _ * _)
combine3(1,2,3, _ min _)
combine3(1,2,3, _ max _)
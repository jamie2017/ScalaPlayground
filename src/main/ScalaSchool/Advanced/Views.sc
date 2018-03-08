val names = Array.fill(100)(Math.random)

names.map(x => x * x).filter(_ < 0.25)

// more efficient
names.view.map(x => x * x).filter(_ < 0.25)


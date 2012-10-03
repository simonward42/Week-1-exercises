println "How tall do you want your pyramid to be?"
int height = Integer.parseInt(System.console().readLine())
println ""

int floor = 1
int width
while(floor<=height) {
    for(width = 1; width<=floor; width++) {
        print floor
    }
    println ""
    floor++
}

println "This program prints on screen all prime numbers up to a given number using Eratosthenes Sieve."
print "Please enter a number:"
int max = Integer.parseInt(System.console().readLine())
if(max<2){
    println "Bad number!"
    return 1
}
println ""
println "Thanks"
println ""

def sieve = []
for(i in 2..max){
    sieve.add(true)
} 

for(i in 2..max){
    println sieve[i-2]
}

int currentNum
for(int i=2; i<=Math.sqrt(max); i++){
    if(sieve[i-2]){
        for(int j=0; (i^2+i*j)<=max ;j++){
            sieve[(i^2 + i*j) - 2] = false
        }
    }
}

// Now all i such that sieve[i-2] is true are prime.

for(k in 2..max){
    if(sieve[k-2]){    
        println k
    }
}

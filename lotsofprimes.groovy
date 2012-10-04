println "This program prints on screen the first 1,000 primes!"
println "Here goes..."
println ""

boolean isPrime(int test){
    if(test<2){
    return false
    }
    if(test%2==0){
        return false
    }
    for(int divisor=3; divisor<=Math.sqrt(test); divisor+=2){
        if(test%divisor==0){
            return false
        }
    }
    return true
}

println "2"
int pCount=1
int num=3
while(pCount<1000){
    if(isPrime(num)){
        println num
        pCount++
    }
    num+=2
}